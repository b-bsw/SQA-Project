package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"aa\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'\\\"aa\\\"'\"/" + "'", str2, "/\"'\\\"aa\\\"'\"/");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator40.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator40.addList(node49);
        java.lang.String str52 = codeGenerator40.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        java.lang.String str59 = codeGenerator57.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str61 = codeGenerator57.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node62, true, context64);
        codeGenerator40.addList(node53, false, context64);
        codeGenerator35.addList(node36, false, context64);
        codeGenerator22.addList(node32, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str52, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str59, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str61, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        java.lang.String str15 = codeGenerator13.jsString("aa");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node16, false, context18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"aa\"" + "'", str15, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        java.lang.String str22 = codeGenerator20.jsString("aa");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator20.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator20.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator20.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node46, false, context48);
        codeGenerator20.addList(node38, false, context48);
        codeGenerator2.addList(node16, true, context48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addAllSiblings(node54);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"aa\"" + "'", str22, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = null;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"a'\\\"//\\\"'a##aa##a\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"a##aa##ahi!\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"a##aa##aa##aa##a'\\\"//\\\"'a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator2.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator2.jsString("\"hi!\"");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\"hi!\"'" + "'", str23, "'\"hi!\"'");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\'\\\\\"\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\'\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\"\\\\'\\\"'\"" + "'", str1, "\"'\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\"\\\\'\\\"'\"");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator2.jsString("/\"\\\"hi!\\\"\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'/\"\\\\\"hi!\\\\\"\"/'" + "'", str20, "'/\"\\\\\"hi!\\\\\"\"/'");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addList(node14, false);
        java.lang.String str18 = codeGenerator10.jsString("\"//\"");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator10.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        java.lang.String str29 = codeGenerator25.jsString("");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator25.addList(node33, true, context35);
        codeGenerator10.addList(node21, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'\"//\"'" + "'", str18, "'\"//\"'");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.jsString("\"\\\"\\\"\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"\\\\\"\\\\\"\"'" + "'", str10, "'\"\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'/\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"/'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator2.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator2.jsString("4/\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"aahi!hi!aahi!hi!hi!hi!hi!hi!aahi!hi!hi!hi!hi!hi!hi!aahi!hi!aaaa\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"/4");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator27.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator27.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator27.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node51, false, context53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator48.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator48.addList(node61, true, context63);
        codeGenerator27.addList(node44, false, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24, context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'4/\"\\'\\\\\"\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\'\\\\\"\\'\"aahi!hi!aahi!hi!hi!hi!hi!hi!aahi!hi!hi!hi!hi!hi!hi!aahi!hi!aaaa\"\\'\\\\\"\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\'\\\\\"\\'\"/4'" + "'", str23, "'4/\"\\'\\\\\"\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\'\\\\\"\\'\"aahi!hi!aahi!hi!hi!hi!hi!hi!aahi!hi!hi!hi!hi!hi!hi!aahi!hi!aaaa\"\\'\\\\\"\\\\\\\\\\'\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\'\\\\\"\\'\"/4'");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"//\\\\\"//\\\\\"//\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"\\\\\"aa\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        java.lang.String str23 = codeGenerator21.jsString("aa");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, true, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/44/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"aa\"" + "'", str23, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("4aa4");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4aa4\"" + "'", str13, "\"4aa4\"");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//\\\"//\\\"//\"", '4', "\"\\\"hi!\\\"\"", "'/\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"/'", "/\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4\"\\\"hi!\\\"\"///\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\"/\"\\\"hi!\\\"\"///\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\"/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"4" + "'", str6, "4\"\\\"hi!\\\"\"///\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\"/\"\\\"hi!\\\"\"///\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\"/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"4");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        java.lang.Class<?> wildcardClass15 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("4aa4");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4aa4\"" + "'", str13, "\"4aa4\"");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        java.lang.String str19 = codeGenerator2.jsString("//aa//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node36, true, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node24, 0, context38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//aa//\"" + "'", str19, "\"//aa//\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node28, false, context30);
        codeGenerator2.addList(node20, false, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"//\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        java.lang.String str10 = codeGenerator2.jsString("//\"\\\"hi!\\\"\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'//\"\\\\\"hi!\\\\\"\"//'" + "'", str10, "'//\"\\\\\"hi!\\\\\"\"//'");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node7, false, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("4//////4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4/\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"///# ///aa/// ## ///aa/// #///\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4/\\\"'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"'\\\"///# ///aa/// ## ///aa/// #///\\\"'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"'\\\"/4\"" + "'", str1, "\"4/\\\"'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"'\\\"///# ///aa/// ## ///aa/// #///\\\"'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"'\\\"/4\"");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"44\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator2.jsString("\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"//\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'" + "'", str21, "'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/a##aa##a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a##aa##a/" + "'", str1, "/a##aa##a/");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        java.lang.String str19 = codeGenerator2.jsString("//aa//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        java.lang.String str31 = codeGenerator27.jsString("");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator27.addList(node32, false, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//aa//\"" + "'", str19, "\"//aa//\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        java.lang.String str19 = codeGenerator2.jsString("/\"  \"/");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'/\"  \"/'" + "'", str19, "'/\"  \"/'");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"44\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\"'\"" + "'", str1, "\"'\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\"'\"");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'//\"\"//'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        java.lang.String str18 = codeGenerator2.jsString("\"a//a\"");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node26, false, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator23.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator23.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator23.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator44.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator44.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node57, true, context59);
        codeGenerator23.addList(node40, false, context59);
        codeGenerator2.addList(node19, false, context59);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'\"a//a\"'" + "'", str18, "'\"a//a\"'");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator2.jsString("/44/");
        java.lang.String str23 = codeGenerator2.jsString("##//\"/\\\"//\\\"/\"'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"hi!'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"\"/\\\"//\\\"/\"//hi!//\"/\\\"//\\\"/\"'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"hi!'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"\"/\\\"//\\\"/\"//##");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator27.addArrayList(node37);
        java.lang.String str40 = codeGenerator27.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator27.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator27.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator27.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator27.addList(node47, true);
        java.lang.String str51 = codeGenerator27.jsString("//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//");
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator56.addList(node60, false);
        java.lang.String str64 = codeGenerator56.jsString("\"//\"");
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator56.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        java.nio.charset.Charset charset70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69, charset70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addList(node72);
        java.lang.String str75 = codeGenerator71.jsString("");
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator71.addList(node76, false);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator71.addList(node79, true, context81);
        codeGenerator56.addList(node67, false, context81);
        codeGenerator27.addList(node52, true, context81);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24, context81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"/44/\"" + "'", str21, "\"/44/\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'##//\"/\\\\\"//\\\\\"/\"\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"hi!\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"\"/\\\\\"//\\\\\"/\"//hi!//\"/\\\\\"//\\\\\"/\"\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"hi!\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"\"/\\\\\"//\\\\\"/\"//##'" + "'", str23, "'##//\"/\\\\\"//\\\\\"/\"\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"hi!\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"\"/\\\\\"//\\\\\"/\"//hi!//\"/\\\\\"//\\\\\"/\"\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"hi!\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\'\"/\\\\\"//\\\\\"/\"\"/\\\\\"//\\\\\"/\"//##'");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str40, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'" + "'", str51, "'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "'\"//\"'" + "'", str64, "'\"//\"'");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"\"" + "'", str75, "\"\"");
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        java.lang.String str24 = codeGenerator20.jsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator46.addList(node49, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        java.lang.String str69 = codeGenerator65.jsString("");
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node77, false, context79);
        codeGenerator65.addList(node70, false, context79);
        codeGenerator46.addList(node61, false, context79);
        codeGenerator39.addList(node42, true, context79);
        codeGenerator2.addList(node35, true, context79);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addList(node85);
        java.lang.String str88 = codeGenerator2.jsString("/\"'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'\"/");
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str41, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "'/\"\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'\"/'" + "'", str88, "'/\"\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'\"/'");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        java.lang.String str28 = codeGenerator26.jsString("aa");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator26.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator26.addAllSiblings(node41);
        java.lang.String str44 = codeGenerator26.jsString("/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator26.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator26.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node63, false, context65);
        codeGenerator53.addList(node56, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator53.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        java.lang.String str78 = codeGenerator74.jsString("");
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer81 = null;
        java.nio.charset.Charset charset82 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator83 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer81, charset82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator83.addList(node84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator83.addList(node86, false, context88);
        codeGenerator74.addList(node79, false, context88);
        codeGenerator53.addList(node70, false, context88);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator53.addAllSiblings(node92);
        com.google.javascript.rhino.Node node94 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context96 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator53.addList(node94, true, context96);
        codeGenerator26.addList(node49, false, context96);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node22, (int) (byte) 10, context96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"aa\"" + "'", str28, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'" + "'", str44, "'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'");
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\"" + "'", str78, "\"\"");
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context96 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context96.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        java.lang.String str13 = codeGenerator11.jsString("aa");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator11.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        java.lang.String str32 = codeGenerator30.jsString("aa");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, true, context37);
        codeGenerator11.addList(node26, true, context37);
        codeGenerator2.addList(node7, false, context37);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"aa\"" + "'", str13, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"aa\"" + "'", str32, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node26, false, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator23.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addArrayList(node33);
        java.lang.String str36 = codeGenerator23.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator23.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator23.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator46.addList(node49, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator46.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        java.lang.String str69 = codeGenerator67.jsString("aa");
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator67.addList(node72, true, context74);
        codeGenerator46.addList(node63, false, context74);
        codeGenerator23.addList(node42, true, context74);
        codeGenerator2.addList(node19, false, context74);
        java.lang.String str80 = codeGenerator2.jsString("/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str36, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"aa\"" + "'", str69, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "'/\"\\\\\"\\\\\"\"/'" + "'", str80, "'/\"\\\\\"\\\\\"\"/'");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        java.lang.String str21 = codeGenerator2.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str21, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/a4aa4a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a4aa4a/" + "'", str1, "/a4aa4a/");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"" + "'", str1, "\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        java.lang.Class<?> wildcardClass22 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator2.jsString("'\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"'");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        java.lang.Class<?> wildcardClass24 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\\'\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\"\\''" + "'", str21, "'\\'\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\"\\''");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        java.lang.String str18 = codeGenerator2.jsString("/\"'\\\"//\\\"'\"/");
        java.lang.String str20 = codeGenerator2.jsString("");
        java.lang.String str22 = codeGenerator2.jsString("//\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"//\\\\\"//\\\\\"//\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'/\"\\'\\\\\"//\\\\\"\\'\"/'" + "'", str18, "'/\"\\'\\\\\"//\\\\\"\\'\"/'");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'//\"\\'\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\"\\'\"//'" + "'", str22, "'//\"\\'\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\"\\'\"//'");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = null;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        java.lang.String str38 = codeGenerator36.jsString("aa");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator36.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator36.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator36.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        java.lang.String str58 = codeGenerator56.jsString("aa");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator56.addList(node62);
        java.lang.String str65 = codeGenerator56.jsString("'\"//\"'");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator56.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator56.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node70, false, context72);
        codeGenerator36.addList(node52, false, context72);
        codeGenerator24.addList(node32, true, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node21, (int) (byte) 0, context72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"aa\"" + "'", str38, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"aa\"" + "'", str58, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str65, "\"'\\\"//\\\"'\"");
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        java.lang.Class<?> wildcardClass9 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        java.lang.Class<?> wildcardClass8 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" //\"4aa4\"/aa/\"4aa4\"// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" //\\\"4aa4\\\"/aa/\\\"4aa4\\\"// \"" + "'", str1, "\" //\\\"4aa4\\\"/aa/\\\"4aa4\\\"// \"");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        java.lang.String str29 = codeGenerator27.jsString("aa");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator27.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator27.addList(node40, true);
        java.lang.String str44 = codeGenerator27.jsString(" //4//////4//4//////4// ");
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator56.addList(node59, false, context61);
        codeGenerator49.addList(node52, true, context61);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator49.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addList(node71);
        java.lang.String str74 = codeGenerator70.jsString("");
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addList(node80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator79.addList(node82, false, context84);
        codeGenerator70.addList(node75, false, context84);
        codeGenerator49.addList(node66, false, context84);
        codeGenerator27.addList(node45, false, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node23, (int) (byte) 10, context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"aa\"" + "'", str29, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\" //4//////4//4//////4// \"" + "'", str44, "\" //4//////4//4//////4// \"");
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\"\"" + "'", str74, "\"\"");
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.jsString("\"\\\"\\\"\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        java.lang.String str16 = codeGenerator1.jsString("/\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"/");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"\\\\\"\\\\\"\"'" + "'", str10, "'\"\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'/\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\"/'" + "'", str16, "'/\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\"/'");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node26, false, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator23.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addArrayList(node33);
        java.lang.String str36 = codeGenerator23.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator23.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator23.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator46.addList(node49, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator46.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        java.nio.charset.Charset charset66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65, charset66);
        java.lang.String str69 = codeGenerator67.jsString("aa");
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator67.addList(node72, true, context74);
        codeGenerator46.addList(node63, false, context74);
        codeGenerator23.addList(node42, true, context74);
        codeGenerator2.addList(node19, false, context74);
        java.lang.Class<?> wildcardClass79 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str36, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"aa\"" + "'", str69, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        java.lang.String str24 = codeGenerator22.jsString("aa");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node27, true, context29);
        codeGenerator2.addList(node18, true, context29);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node45, false, context47);
        codeGenerator35.addList(node38, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55);
        java.lang.String str58 = codeGenerator54.jsString("");
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator63.addList(node66, false, context68);
        codeGenerator54.addList(node59, false, context68);
        codeGenerator35.addList(node50, false, context68);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        java.nio.charset.Charset charset75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74, charset75);
        java.lang.String str78 = codeGenerator76.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str80 = codeGenerator76.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator76.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator76.addList(node83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator76.addList(node85, false, context87);
        codeGenerator35.addList(node72, true, context87);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node32, context87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"aa\"" + "'", str24, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\"" + "'", str58, "\"\"");
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str78, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str80, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator16.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node24, true, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        java.lang.String str36 = codeGenerator34.jsString("aa");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator34.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator34.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator34.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator56.addList(node60, false, context62);
        codeGenerator34.addList(node52, false, context62);
        codeGenerator16.addList(node30, true, context62);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addList(node71, true);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator70.addList(node74, false, context76);
        codeGenerator16.addList(node66, true, context76);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"aa\"" + "'", str36, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'//\"\\'\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'\\'\"//'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'\"\\'\\\\\"//\\\\\"\\'\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'/\"" + "'", str1, "\"/'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'/\"");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4\"4a##aa##a4\"//aa//\"4a##aa##a4\"4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4\"4a##aa##a4\"//aa//\"4a##aa##a4\"4" + "'", str1, "4\"4a##aa##a4\"//aa//\"4a##aa##a4\"4");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator40.addList(node44, true, context46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator40.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator40.addList(node55, true);
        java.lang.String str59 = codeGenerator40.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node60, false, context62);
        codeGenerator28.addList(node36, false, context62);
        codeGenerator2.addList(node24, false, context62);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str59, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"" + "'", str1, "\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"4aa4\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"4aa4\\\"\"/" + "'", str1, "/\"\\\"4aa4\\\"\"/");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("4/\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"///# ///aa/// ## ///aa/// #///\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"/4");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = null;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addList(node24);
        java.lang.String str27 = codeGenerator15.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator15.addList(node28, true);
        java.lang.String str32 = codeGenerator15.jsString("//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
        java.lang.String str34 = codeGenerator15.jsString("/4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4/");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator15.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator49.addList(node52, false, context54);
        codeGenerator42.addList(node45, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator42.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        java.lang.String str65 = codeGenerator63.jsString("aa");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator63.addList(node68, true, context70);
        codeGenerator42.addList(node59, false, context70);
        codeGenerator15.addList(node38, true, context70);
        codeGenerator1.addList(node11, false, context70);
        com.google.javascript.rhino.Node node75 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str27, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str32, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'" + "'", str34, "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'");
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\"aa\"" + "'", str65, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addAllSiblings(node25);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"", 'a', "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", "'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'", "\"/aa/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'//\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"hi!\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"//'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"a" + "'", str6, "a\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'//\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"hi!\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"//'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"a");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
        java.lang.String str24 = codeGenerator2.jsString("//");
        java.lang.String str26 = codeGenerator2.jsString("/ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"//\"" + "'", str24, "\"//\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "'/ahi!\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'hi!hi!hi!hi!hi!\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'hi!a/'" + "'", str26, "'/ahi!\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'hi!hi!hi!hi!hi!\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'hi!a/'");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node40, false, context42);
        codeGenerator30.addList(node33, true, context42);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator30.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52);
        java.lang.String str55 = codeGenerator51.jsString("");
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node63, false, context65);
        codeGenerator51.addList(node56, false, context65);
        codeGenerator30.addList(node47, false, context65);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator30.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node71, true, context73);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node26, (int) (short) -1, context73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\"" + "'", str55, "\"\"");
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/ /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, false, context23);
        codeGenerator11.addList(node14, true, context23);
        codeGenerator2.addList(node7, false, context23);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/");
        java.lang.String str16 = codeGenerator2.jsString("\"'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'\"");
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'/\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'/'" + "'", str14, "'/\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'/'");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'\"\\'/\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"/\\'\"'" + "'", str16, "'\"\\'/\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"/\\'\"'");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        java.lang.String str16 = codeGenerator14.jsString("aa");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node19, true, context21);
        codeGenerator2.addList(node10, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40);
        java.lang.String str43 = codeGenerator39.jsString("");
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node44, false, context46);
        codeGenerator28.addList(node35, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator28.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        java.lang.String str60 = codeGenerator56.jsString("");
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node64, true, context66);
        codeGenerator28.addList(node52, true, context66);
        codeGenerator2.addList(node24, false, context66);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator2.addList(node70);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        java.lang.String str21 = codeGenerator2.jsString("\"/\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        java.lang.String str42 = codeGenerator40.jsString("aa");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator40.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator40.addList(node49, true, context51);
        codeGenerator28.addList(node36, false, context51);
        codeGenerator2.addList(node24, false, context51);
        java.lang.String str56 = codeGenerator2.jsString("////\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"////");
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addList(node57, true);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"/\\\\\"//\\\\\"/\"'" + "'", str21, "'\"/\\\\\"//\\\\\"/\"'");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"aa\"" + "'", str42, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "'////\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"////'" + "'", str56, "'////\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"////'");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator15.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator15.addList(node30, true);
        java.lang.String str34 = codeGenerator15.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node35, false, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str34, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//aa//\"", ' ', "\"//\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"//\"", "4/\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"aahi!hi!aahi!hi!hi!hi!hi!hi!aahi!hi!hi!hi!hi!hi!hi!aahi!hi!aaaa\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"/4", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " \"//\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"//\"//aa//\"//\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"//\" " + "'", str6, " \"//\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"//\"//aa//\"//\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"//\" ");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        java.lang.Class<?> wildcardClass17 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node14, false, context16);
        codeGenerator2.addList(node7, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        java.lang.String str29 = codeGenerator25.jsString("");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node30, false, context32);
        codeGenerator2.addList(node21, false, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("aa");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node48, true, context50);
        codeGenerator2.addList(node35, true, context50);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addAllSiblings(node55);
        java.lang.String str58 = codeGenerator2.jsString("\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addList(node59);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"aa\"" + "'", str41, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "'\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"'" + "'", str58, "'\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"'");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        java.lang.String str23 = codeGenerator2.jsString("\"44\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\"44\"'" + "'", str23, "'\"44\"'");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator19.addList(node28);
        java.lang.String str31 = codeGenerator19.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator19.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator19.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator19.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        java.lang.String str45 = codeGenerator43.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator57.addList(node60, false, context62);
        codeGenerator50.addList(node53, true, context62);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70);
        java.lang.String str73 = codeGenerator69.jsString("");
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        java.nio.charset.Charset charset77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76, charset77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator78.addList(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator78.addList(node81, false, context83);
        codeGenerator69.addList(node74, false, context83);
        codeGenerator50.addList(node65, false, context83);
        codeGenerator43.addList(node46, true, context83);
        codeGenerator19.addList(node39, true, context83);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, 1, context83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str31, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str45, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"\"" + "'", str73, "\"\"");
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"///\"" + "'", str1, "\"///\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"///\"");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/a//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//#hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!hi!#//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//a/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        java.lang.String str23 = codeGenerator2.jsString("////////");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'/ahi!\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'hi!hi!hi!hi!hi!\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'hi!a/'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"////////\"" + "'", str23, "\"////////\"");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("aa");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        java.lang.String str32 = codeGenerator30.jsString("aa");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, true, context37);
        codeGenerator18.addList(node26, false, context37);
        codeGenerator2.addList(node14, false, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        java.lang.String str47 = codeGenerator45.jsString("aa");
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator45.addArrayList(node53);
        java.lang.String str56 = codeGenerator45.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator45.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator45.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator65.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator65.addList(node74);
        java.lang.String str77 = codeGenerator65.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        java.nio.charset.Charset charset81 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator82 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80, charset81);
        java.lang.String str84 = codeGenerator82.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str86 = codeGenerator82.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator82.addList(node87, true, context89);
        codeGenerator65.addList(node78, false, context89);
        codeGenerator45.addList(node61, true, context89);
        codeGenerator2.addList(node41, false, context89);
        java.lang.Class<?> wildcardClass94 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"aa\"" + "'", str20, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"aa\"" + "'", str32, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"aa\"" + "'", str47, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str56, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str77, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str84, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str86, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"////\"", '4', "'/\"  \"/'", "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'", "\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4'/\"  \"/'////'/\"  \"/'4" + "'", str6, "4'/\"  \"/'////'/\"  \"/'4");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        java.nio.charset.Charset charset5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4, charset5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator6.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator6.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator6.addList(node15);
        java.lang.String str18 = codeGenerator6.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        java.lang.String str25 = codeGenerator23.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str27 = codeGenerator23.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator23.addList(node28, true, context30);
        codeGenerator6.addList(node19, false, context30);
        codeGenerator1.addList(node2, false, context30);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str18, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str25, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str27, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        java.lang.String str23 = codeGenerator21.jsString("aa");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, true, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node33, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"aa\"" + "'", str23, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\\'4///\"hi!\"//#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#hi!/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/##/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#//\"hi!\"///4\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\\'4///\"hi!\"//#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#hi!/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/##/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#//\"hi!\"///4\\''/" + "'", str1, "/'\\'4///\"hi!\"//#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#hi!/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#/\"\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\"\"/#/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/##/\\\\\\'\"//\"\\\\\\'/4a##aa##a4/\\\\\\'\"//\"\\\\\\'/#//\"hi!\"///4\\''/");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        java.lang.String str8 = codeGenerator2.jsString("////");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        java.lang.String str13 = codeGenerator2.jsString("/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"////\"" + "'", str8, "\"////\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'" + "'", str13, "'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("4\"4a##aa##a4\"//aa//\"4a##aa##a4\"4");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
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
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a /\"\"//\"\"/##/\"\"//\"\"//\"\"/hi!/\"\"//\"\"//\"\"/##/\"\"//\"\"/4aa4/\"\"//\"\"/##/\"\"//\"\"//\"\"/hi!/\"\"//\"\"//\"\"/##/\"\"//\"\"/ a", '#', "\"//\\\"\\\"//\"", "'/\"\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'\"/'", "'\"\\\\\"\\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a /\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/hi!/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/4aa4/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/hi!/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/ a#" + "'", str6, "#a /\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/hi!/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/4aa4/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/hi!/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/ a#");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator12.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator12.addList(node27, true);
        java.lang.String str31 = codeGenerator12.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node32, false, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node9, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str31, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'//\"\\'\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'\\'\"//'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'//\\\"\\\\'\\\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\'\\\\'\\\"//'/\"" + "'", str1, "\"/'//\\\"\\\\'\\\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\'\\\\'\\\"//'/\"");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        java.lang.Class<?> wildcardClass10 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
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
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) (short) 10, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node26, true, context28);
        java.lang.String str31 = codeGenerator18.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37);
        java.lang.String str40 = codeGenerator36.jsString("");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node44, true, context46);
        codeGenerator18.addList(node32, true, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, 100, context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str31, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"a##aa##a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"a##aa##a\"/" + "'", str2, "/\"a##aa##a\"/");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        java.lang.String str18 = codeGenerator2.jsString("/\"'\\\"//\\\"'\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/'\\'\\\\\\'\"/#hi!\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"hi!hi!#/\"\\\\\\'\\''/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'/\"\\'\\\\\"//\\\\\"\\'\"/'" + "'", str18, "'/\"\\'\\\\\"//\\\\\"\\'\"/'");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        java.lang.String str16 = codeGenerator14.jsString("aa");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node23, true, context25);
        codeGenerator2.addList(node10, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"4aa4\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"4aa4\\\"\"//" + "'", str2, "//\"\\\"4aa4\\\"\"//");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("#a /\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/hi!/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/4aa4/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/hi!/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/##/\"//\\\"\\\"//\"\"//\\\"\\\"//\"//\"//\\\"\\\"//\"\"//\\\"\\\"//\"/ a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        java.lang.String str24 = codeGenerator20.jsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator46.addList(node49, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        java.lang.String str69 = codeGenerator65.jsString("");
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node77, false, context79);
        codeGenerator65.addList(node70, false, context79);
        codeGenerator46.addList(node61, false, context79);
        codeGenerator39.addList(node42, true, context79);
        codeGenerator2.addList(node35, true, context79);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addArrayList(node85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator2.addList(node87, false);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str41, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\"" + "'", str1, "\"//\"");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//##//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//##//\\\"\"" + "'", str1, "\"\\\"//##//\\\"\"");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        java.lang.String str21 = codeGenerator2.jsString("\"/\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"/\\\\\"//\\\\\"/\"'" + "'", str21, "'\"/\\\\\"//\\\\\"/\"'");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        java.lang.String str17 = codeGenerator13.jsString("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node18, false, context20);
        codeGenerator2.addList(node9, false, context20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        java.lang.String str8 = codeGenerator2.jsString("////");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"////\"" + "'", str8, "\"////\"");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "'4///\"hi!\"//#/\\'\"//\"\\'/4a##aa##a4/\\'\"//\"\\'/#/\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"/#/\\'\"//\"\\'/4a##aa##a4/\\'\"//\"\\'/#/\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"/#/\\'\"//\"\\'/4a##aa##a4/\\'\"//\"\\'/#hi!/\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"/#/\\'\"//\"\\'/4a##aa##a4/\\'\"//\"\\'/#/\"\\\\\"\\\\\"\"//\"\\\\\"\\\\\"\"/#/\\'\"//\"\\'/4a##aa##a4/\\'\"//\"\\'/##/\\'\"//\"\\'/4a##aa##a4/\\'\"//\"\\'/#//\"hi!\"///4'", "\"\\\"/4//////4/\\\"\"", "\"//\\\"\\\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        java.lang.String str18 = codeGenerator2.jsString("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        java.lang.String str26 = codeGenerator24.jsString("aa");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node43, false, context45);
        codeGenerator33.addList(node36, true, context45);
        codeGenerator24.addList(node29, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'//\"\\\\\"hi!\\\\\"\"//'" + "'", str18, "'//\"\\\\\"hi!\\\\\"\"//'");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"aa\"" + "'", str26, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/a//////a/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator28.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addArrayList(node38);
        java.lang.String str41 = codeGenerator28.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator28.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        java.lang.String str50 = codeGenerator48.jsString("aa");
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node53, true, context55);
        codeGenerator28.addList(node44, true, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node25, context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str41, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"aa\"" + "'", str50, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6, charset7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator8.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node16, true, context18);
        codeGenerator1.addList(node4, false, context18);
        java.lang.String str22 = codeGenerator1.jsString("'\\'\\\\\\'\"/#hi!\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"hi!hi!#/\"\\\\\\'\\''");
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'\\'\\\\\\'\\\\\\\\\\\\\\'\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\"\\\\\\\\\\\\\\'\\\\\\'\\''" + "'", str22, "'\\'\\\\\\'\\\\\\\\\\\\\\'\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\"\\\\\\\\\\\\\\'\\\\\\'\\''");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        java.lang.String str17 = codeGenerator13.jsString("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node18, false, context20);
        codeGenerator2.addList(node9, false, context20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        java.lang.String str34 = codeGenerator30.jsString("");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator2.addList(node26, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        java.lang.String str51 = codeGenerator49.jsString("aa");
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator49.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator49.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator49.addList(node59, false);
        java.lang.String str63 = codeGenerator49.jsString("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator49.addList(node64, true);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator49.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75, false);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator74.addList(node78, true, context80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node82, true, context84);
        codeGenerator49.addList(node70, false, context84);
        codeGenerator2.addList(node45, false, context84);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"aa\"" + "'", str51, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''" + "'", str63, "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        java.lang.String str22 = codeGenerator20.jsString("aa");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addArrayList(node28);
        java.lang.String str31 = codeGenerator20.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator20.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator40.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator40.addList(node49);
        java.lang.String str52 = codeGenerator40.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        java.lang.String str59 = codeGenerator57.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str61 = codeGenerator57.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator57.addList(node62, true, context64);
        codeGenerator40.addList(node53, false, context64);
        codeGenerator20.addList(node36, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"aa\"" + "'", str22, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str31, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str52, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str59, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str61, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        java.lang.String str12 = codeGenerator2.jsString("\"\\\"/'\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\"'/\\\"\"");
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\\\\"/\\'\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"\\'/\\\\\"\"'" + "'", str12, "'\"\\\\\"/\\'\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\"\\'/\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        java.lang.String str19 = codeGenerator17.jsString("aa");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node26, true, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator17.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator17.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node43, false, context45);
        codeGenerator17.addList(node35, false, context45);
        codeGenerator2.addList(node13, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/\"/\\\"hi!\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"aa\"" + "'", str19, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        java.lang.String str34 = codeGenerator30.jsString("");
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node35, false, context37);
        codeGenerator19.addList(node26, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator19.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48);
        java.lang.String str51 = codeGenerator47.jsString("");
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node55, true, context57);
        codeGenerator19.addList(node43, true, context57);
        codeGenerator2.addList(node15, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addList(node63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'//\\'/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/\\'//'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"" + "'", str51, "\"\"");
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        java.lang.String str19 = codeGenerator2.jsString("//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str19, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        java.lang.String str24 = codeGenerator22.jsString("aa");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        java.lang.String str37 = codeGenerator33.jsString("");
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node45, false, context47);
        codeGenerator33.addList(node38, false, context47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator33.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        java.lang.String str60 = codeGenerator56.jsString("");
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator56.addList(node61, false, context63);
        codeGenerator33.addList(node52, false, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator33.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addList(node73, false);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator72.addList(node76, true, context78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node80, true, context82);
        codeGenerator33.addList(node68, true, context82);
        codeGenerator22.addList(node29, true, context82);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) (short) 10, context82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"aa\"" + "'", str24, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\"" + "'", str37, "\"\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        java.lang.String str26 = codeGenerator2.jsString("//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator31.addList(node35, false);
        java.lang.String str39 = codeGenerator31.jsString("\"//\"");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator31.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        java.lang.String str50 = codeGenerator46.jsString("");
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator31.addList(node42, false, context56);
        codeGenerator2.addList(node27, true, context56);
        com.google.javascript.rhino.Node node60 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node60, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'" + "'", str26, "'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "'\"//\"'" + "'", str39, "'\"//\"'");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\"" + "'", str50, "\"\"");
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'\\\"/\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/'\\\"/\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'/\"/" + "'", str2, "/\"/'\\\"/\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'/\"/");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        java.lang.String str16 = codeGenerator2.jsString("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''" + "'", str16, "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"//\"" + "'", str1, "\"//\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"//\"");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
        java.lang.String str24 = codeGenerator2.jsString("//");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\"\\\\'\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"//\"" + "'", str24, "\"//\"");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'/'/" + "'", str1, "/'/\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'/'/");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4/'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//////'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4/'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//////'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''/4" + "'", str1, "4/'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//////'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''/4");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a/a4aa4a/a", 'a', "\"/\\\"'\\\\\\\"\\\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\'\\\\\\\"'\\\"/\"", "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''", "/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa/a4aa4a/aa" + "'", str6, "aa/a4aa4a/aa");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//\"\\\"hi!\\\"\"//", '#', "a4aa4a", "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'", "/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//a4aa4a/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/a4aa4ahi!/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/a4aa4aa4aa4a//#" + "'", str6, "#//a4aa4a/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/a4aa4ahi!/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/a4aa4aa4aa4a//#");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator2.jsString("/\"\\\"hi!\\\"\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node23, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'/\"\\\\\"hi!\\\\\"\"/'" + "'", str20, "'/\"\\\\\"hi!\\\\\"\"/'");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        java.lang.String str19 = codeGenerator2.jsString("'\"hi!\"'");
        java.lang.String str21 = codeGenerator2.jsString("4a##aa##a4");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"'\\\"hi!\\\"'\"" + "'", str19, "\"'\\\"hi!\\\"'\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"4a##aa##a4\"" + "'", str21, "\"4a##aa##a4\"");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/'\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        java.lang.String str17 = codeGenerator13.jsString("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node18, false, context20);
        codeGenerator2.addList(node9, false, context20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        java.lang.String str34 = codeGenerator30.jsString("");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator2.addList(node26, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        java.lang.Class<?> wildcardClass45 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"#/#/aa/#/#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"#/#/aa/#/#\"/" + "'", str1, "/\"#/#/aa/#/#\"/");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("//\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator2.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator2.jsString("\"hi!\"");
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\"hi!\"'" + "'", str23, "'\"hi!\"'");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"'\\\"//\\\"'\"/", '#', "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/", "'\"\\'\\\\\"//\\\\\"\\'\"'", "/\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/'\"\\'\\\\\"//\\\\\"\\'\"'/\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"////\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/'\"\\'\\\\\"//\\\\\"\\'\"'/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"//#" + "'", str6, "#//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/'\"\\'\\\\\"//\\\\\"\\'\"'/\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"////\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/'\"\\'\\\\\"//\\\\\"\\'\"'/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"//#");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        java.lang.String str21 = codeGenerator2.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str21, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"aa\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"aa\"///" + "'", str2, "///\"aa\"///");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
            codeGenerator1.addExpr(node9, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        java.lang.String str23 = codeGenerator2.jsString("////////");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        java.lang.String str30 = codeGenerator28.jsString("aa");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        java.lang.String str42 = codeGenerator40.jsString("aa");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node45, true, context47);
        codeGenerator28.addList(node36, false, context47);
        codeGenerator2.addList(node24, false, context47);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node51, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"////////\"" + "'", str23, "\"////////\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"aa\"" + "'", str30, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"aa\"" + "'", str42, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//////\"" + "'", str1, "\"//////\"");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node19, false, context21);
        codeGenerator9.addList(node12, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node40, false, context42);
        codeGenerator28.addList(node33, false, context42);
        codeGenerator9.addList(node24, false, context42);
        codeGenerator2.addList(node5, true, context42);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addAllSiblings(node49);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a/a4aa4a/a", 'a', "44", "\"////\"", "4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa/a4aa4a/aa" + "'", str6, "aa/a4aa4a/aa");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("4aa4");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addList(node27);
        java.lang.String str30 = codeGenerator18.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator18.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node34, false, context36);
        codeGenerator2.addList(node14, false, context36);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator2.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator45.addList(node49, false, context51);
        codeGenerator2.addList(node41, true, context51);
        com.google.javascript.rhino.Node node54 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4aa4\"" + "'", str13, "\"4aa4\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str30, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node19, false, context21);
        codeGenerator9.addList(node12, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node40, false, context42);
        codeGenerator28.addList(node33, false, context42);
        codeGenerator9.addList(node24, false, context42);
        codeGenerator2.addList(node5, true, context42);
        java.lang.Class<?> wildcardClass47 = context42.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        java.lang.String str17 = codeGenerator2.jsString("'\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"'");
        java.lang.String str19 = codeGenerator2.jsString("/\"'\\\"//\\\"'\"/");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\\'\"\\\\\\\\\"#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#\\\\\\\\\"\"\\''" + "'", str17, "'\\'\"\\\\\\\\\"#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#\\\\\\\\\"\"\\''");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'/\"\\'\\\\\"//\\\\\"\\'\"/'" + "'", str19, "'/\"\\'\\\\\"//\\\\\"\\'\"/'");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"////\\\"\"" + "'", str1, "\"\\\"////\\\"\"");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator2.jsString("'\"/\\\\\"//\\\\\"/\"'");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\''" + "'", str20, "'\\'\"/\\\\\\\\\"//\\\\\\\\\"/\"\\''");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node17, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, (int) 'a', context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, 0, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/");
        java.lang.String str16 = codeGenerator2.jsString("\"'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'/\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'/'" + "'", str14, "'/\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'/'");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'\"\\'/\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"/\\'\"'" + "'", str16, "'\"\\'/\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"/\\'\"'");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/'//\\'\"\\\\\\'\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\\\\\\'\"\\'//'/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        java.lang.String str35 = codeGenerator31.jsString("");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node36, false, context38);
        codeGenerator17.addList(node27, false, context38);
        codeGenerator2.addList(node13, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addAllSiblings(node42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("// /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ //");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("///\"aa\"///", '#', "#a /aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/4aa4/aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/ a#", "/\"/'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'/\"/", "////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#///#a /aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/4aa4/aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/ a#aa#a /aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/4aa4/aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/ a#///#" + "'", str6, "#///#a /aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/4aa4/aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/ a#aa#a /aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/4aa4/aaaa//aaaa/##/aaaa//aaaa//aaaa/hi!/aaaa//aaaa//aaaa/##/aaaa//aaaa/ a#///#");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        java.lang.String str21 = codeGenerator19.jsString("aa");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node27, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"aa\"" + "'", str21, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        java.lang.String str13 = codeGenerator2.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        java.lang.String str22 = codeGenerator2.jsString("'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'\\'\"\\\\\\'\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\\\\\\'\"\\''" + "'", str22, "'\\'\"\\\\\\'\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\\\\\\'\"\\''");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addList(node24);
        java.lang.String str27 = codeGenerator15.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        java.lang.String str34 = codeGenerator32.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str36 = codeGenerator32.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator32.addList(node37, true, context39);
        codeGenerator15.addList(node28, false, context39);
        codeGenerator2.addList(node11, true, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str27, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str34, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str36, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        java.lang.String str16 = codeGenerator2.jsString("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''" + "'", str16, "'\\'\"\\\\\\\\\"\\\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\'\\\\\\\\\"\"\\''");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/'\\\"/\\\\\\\\\\\"\\\\\\\\\\\"/\\\"'/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"#/#/aa/#/#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"#/#/aa/#/#\\\"\"" + "'", str1, "\"\\\"#/#/aa/#/#\\\"\"");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
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
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node19, true, context21);
        java.lang.String str24 = codeGenerator11.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30);
        java.lang.String str33 = codeGenerator29.jsString("");
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator29.addList(node37, true, context39);
        codeGenerator11.addList(node25, true, context39);
        codeGenerator1.addList(node7, false, context39);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator1.addAllSiblings(node43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str24, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"" + "'", str33, "\"\"");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"\\\"4aa4\\\"\"/", '4', "\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"", "//'\"\\'\\\\\"//\\\\\"\\'\"'//", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"4aa4\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"/4" + "'", str6, "4/\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"4aa4\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"\"///'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'///\"/4");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4\" //4//////4//4//////4// \" ///aa/// \" //4//////4//4//////4// \"4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4\" //4//////4//4//////4// \" ///aa/// \" //4//////4//4//////4// \"4" + "'", str1, "4\" //4//////4//4//////4// \" ///aa/// \" //4//////4//4//////4// \"4");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        java.lang.String str24 = codeGenerator20.jsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator46.addList(node49, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        java.lang.String str69 = codeGenerator65.jsString("");
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node77, false, context79);
        codeGenerator65.addList(node70, false, context79);
        codeGenerator46.addList(node61, false, context79);
        codeGenerator39.addList(node42, true, context79);
        codeGenerator2.addList(node35, true, context79);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addList(node85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("a\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'//\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"hi!\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"\"/aa/\"\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"//'//\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"//'\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str41, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        java.lang.String str10 = codeGenerator2.jsString("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator19.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator19.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator19.addList(node36, true, context38);
        codeGenerator2.addList(node15, true, context38);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'//\"\\\\\"hi!\\\\\"\"//'" + "'", str10, "'//\"\\\\\"hi!\\\\\"\"//'");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//a4aa4a//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node28, false, context30);
        codeGenerator2.addList(node20, false, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        java.lang.String str46 = codeGenerator42.jsString("");
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node54, false, context56);
        codeGenerator42.addList(node47, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator42.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        java.lang.String str69 = codeGenerator65.jsString("");
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator65.addList(node70, false, context72);
        codeGenerator42.addList(node61, false, context72);
        codeGenerator2.addList(node38, true, context72);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"\"" + "'", str46, "\"\"");
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        java.lang.Class<?> wildcardClass10 = context8.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        java.lang.String str8 = codeGenerator2.jsString("#'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'//aa//'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'#");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'#\\'//#hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!#//\\'//aa//\\'//#hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!#//\\'#'" + "'", str8, "'#\\'//#hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!#//\\'//aa//\\'//#hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!\"\\\\\\\\\"hi!\\\\\\\\\"\"hi!hi!#//\\'#'");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//////\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//////\"/" + "'", str2, "/\"//////\"/");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("// /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ //");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        java.lang.String str27 = codeGenerator25.jsString("aa");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator36.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node44, true, context46);
        java.lang.String str49 = codeGenerator36.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55);
        java.lang.String str58 = codeGenerator54.jsString("");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator54.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator54.addList(node62, true, context64);
        codeGenerator36.addList(node50, true, context64);
        codeGenerator25.addList(node32, false, context64);
        codeGenerator2.addList(node21, true, context64);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addList(node74);
        java.lang.String str77 = codeGenerator73.jsString("");
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        java.nio.charset.Charset charset81 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator82 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80, charset81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator82.addList(node83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator82.addList(node85, false, context87);
        codeGenerator73.addList(node78, false, context87);
        codeGenerator2.addList(node69, true, context87);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("4a//a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"aa\"" + "'", str27, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str49, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"\"" + "'", str58, "\"\"");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\"\"" + "'", str77, "\"\"");
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/4//////4/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/4/\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"aahi!hi!aahi!hi!hi!hi!hi!hi!aahi!hi!hi!hi!hi!hi!hi!aahi!hi!aaaa\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"/4/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"\\\\\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\\\\\"\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\\\\\"\\\\\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\\\\\"\\\\\"\"'/" + "'", str2, "/'\"\\\\\"\\\\\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\\\\\"\\\\\"\"'/");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        java.lang.String str19 = codeGenerator2.jsString("'\"hi!\"'");
        java.lang.String str21 = codeGenerator2.jsString("4a##aa##a4");
        java.lang.Class<?> wildcardClass22 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"'\\\"hi!\\\"'\"" + "'", str19, "\"'\\\"hi!\\\"'\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"4a##aa##a4\"" + "'", str21, "\"4a##aa##a4\"");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node12, false, context14);
        codeGenerator2.addList(node5, true, context14);
        java.lang.String str18 = codeGenerator2.jsString("//\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"//");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("//\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'//\"\\'\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'\\'\"//'" + "'", str18, "'//\"\\'\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'\\'\"//'");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator2.jsString("/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator30.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator30.addList(node39);
        java.lang.String str42 = codeGenerator30.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator30.addList(node43, true);
        java.lang.String str47 = codeGenerator30.jsString("//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
        java.lang.String str49 = codeGenerator30.jsString("/4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4/");
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator30.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator64.addList(node67, false, context69);
        codeGenerator57.addList(node60, true, context69);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator57.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        java.nio.charset.Charset charset77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76, charset77);
        java.lang.String str80 = codeGenerator78.jsString("aa");
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator78.addAllSiblings(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator78.addList(node83, true, context85);
        codeGenerator57.addList(node74, false, context85);
        codeGenerator30.addList(node53, true, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node27, context85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'" + "'", str20, "'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str42, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str47, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'" + "'", str49, "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'");
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"aa\"" + "'", str80, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        java.lang.String str16 = codeGenerator2.jsString("\"/\\\"//\\\"/\"");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'\"/\\\\\"//\\\\\"/\"'" + "'", str16, "'\"/\\\\\"//\\\\\"/\"'");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
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
        codeGenerator1.addList(node13, false);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        java.lang.String str24 = codeGenerator20.jsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        java.lang.String str13 = codeGenerator2.jsString("\"'\\\"\\\\'//\\\\\\\\\\\"\\\\\\\\\\\"//\\\\'\\\"'\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\'\\\\\"\\'\"'" + "'", str13, "'\"\\'\\\\\"\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\'\\\\\"\\'\"'");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"\"" + "'", str1, "\"\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"\"");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        java.lang.String str24 = codeGenerator20.jsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/aa/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/aa/\"/" + "'", str1, "/\"/aa/\"/");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"/#/aa/#/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = null;
        codeGenerator2.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node21, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        java.lang.String str27 = codeGenerator25.jsString("aa");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        java.lang.String str39 = codeGenerator37.jsString("aa");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node42, true, context44);
        codeGenerator25.addList(node33, false, context44);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node54, false, context56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63);
        java.lang.String str66 = codeGenerator62.jsString("");
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator62.addList(node67, false, context69);
        codeGenerator51.addList(node58, false, context69);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator51.addList(node72, false);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addList(node80);
        java.lang.String str83 = codeGenerator79.jsString("");
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator79.addList(node84, false);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator79.addList(node87, true, context89);
        codeGenerator51.addList(node75, true, context89);
        codeGenerator25.addList(node47, false, context89);
        codeGenerator2.addList(node21, false, context89);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addList(node94);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"aa\"" + "'", str27, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"aa\"" + "'", str39, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\"" + "'", str66, "\"\"");
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "\"\"" + "'", str83, "\"\"");
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        java.lang.String str22 = codeGenerator20.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node37, false, context39);
        codeGenerator27.addList(node30, true, context39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        java.lang.String str50 = codeGenerator46.jsString("");
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator55.addList(node58, false, context60);
        codeGenerator46.addList(node51, false, context60);
        codeGenerator27.addList(node42, false, context60);
        codeGenerator20.addList(node23, true, context60);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator69.addList(node72, false, context74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator69.addList(node76, false);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator69.addList(node79, true);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator69.addList(node82, true, context84);
        codeGenerator20.addList(node65, true, context84);
        codeGenerator2.addList(node16, true, context84);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator2.addList(node88);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addList(node90, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str22, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\"" + "'", str50, "\"\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = null;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addList(node24);
        java.lang.String str27 = codeGenerator15.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator15.addList(node28, true);
        java.lang.String str32 = codeGenerator15.jsString("//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
        java.lang.String str34 = codeGenerator15.jsString("/4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4/");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator15.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator49.addList(node52, false, context54);
        codeGenerator42.addList(node45, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator42.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        java.lang.String str65 = codeGenerator63.jsString("aa");
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator63.addList(node68, true, context70);
        codeGenerator42.addList(node59, false, context70);
        codeGenerator15.addList(node38, true, context70);
        codeGenerator1.addList(node11, false, context70);
        java.lang.String str76 = codeGenerator1.jsString("\"//\\\"//\\\"//\"");
        com.google.javascript.rhino.Node node77 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str27, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str32, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'" + "'", str34, "'/4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4/'");
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\"aa\"" + "'", str65, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "'\"//\\\\\"//\\\\\"//\"'" + "'", str76, "'\"//\\\\\"//\\\\\"//\"'");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = null;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node29, false, context31);
        codeGenerator19.addList(node22, true, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, (-1), context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/4/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/aa/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//4/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/aa/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/4//" + "'", str1, "//4/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/aa/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/4//");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("aa");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        java.lang.String str32 = codeGenerator30.jsString("aa");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, true, context37);
        codeGenerator18.addList(node26, false, context37);
        codeGenerator2.addList(node14, false, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        java.lang.String str47 = codeGenerator45.jsString("aa");
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator45.addArrayList(node53);
        java.lang.String str56 = codeGenerator45.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator45.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator45.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator65.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator65.addList(node74);
        java.lang.String str77 = codeGenerator65.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        java.nio.charset.Charset charset81 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator82 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80, charset81);
        java.lang.String str84 = codeGenerator82.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str86 = codeGenerator82.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator82.addList(node87, true, context89);
        codeGenerator65.addList(node78, false, context89);
        codeGenerator45.addList(node61, true, context89);
        codeGenerator2.addList(node41, false, context89);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addList(node94);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addAllSiblings(node96);
        com.google.javascript.rhino.Node node98 = null;
        codeGenerator2.addArrayList(node98);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"aa\"" + "'", str20, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"aa\"" + "'", str32, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"aa\"" + "'", str47, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str56, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str77, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str84, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str86, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        java.lang.String str8 = codeGenerator2.jsString("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'#\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"\"//\"//\"//\"\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"#'" + "'", str8, "'#\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"\"//\"//\"//\"\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"#'");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        java.lang.String str10 = codeGenerator2.jsString("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'//\"\\\\\"hi!\\\\\"\"//'" + "'", str10, "'//\"\\\\\"hi!\\\\\"\"//'");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator2.jsString("\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'" + "'", str21, "'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("//'4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4'//");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'//\\'4/\"\\\\\\\\\"#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#\\\\\\\\\"\"//\"\\\\\\\\\"#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#\\\\\\\\\"\"/4\\'//'" + "'", str14, "'//\\'4/\"\\\\\\\\\"#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#\\\\\\\\\"\"//\"\\\\\\\\\"#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#\\\\\\\\\"\"/4\\'//'");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/'//\"\\'\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'\\'\"//'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        java.lang.String str23 = codeGenerator21.jsString("aa");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, true, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"aa\"" + "'", str23, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addAllSiblings(node25);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        java.lang.String str15 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node34, false, context36);
        codeGenerator24.addList(node27, true, context36);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46);
        java.lang.String str49 = codeGenerator45.jsString("");
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node57, false, context59);
        codeGenerator45.addList(node50, false, context59);
        codeGenerator24.addList(node41, false, context59);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator24.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator24.addList(node65, true, context67);
        codeGenerator2.addList(node20, true, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"" + "'", str49, "\"\"");
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str1, "\"/\\\"//\\\"/\"");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        java.lang.String str13 = codeGenerator2.jsString("\"///\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"///\"");
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"///\\\\\"\\\\\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\\\\\"\\\\\"///\"'" + "'", str13, "'\"///\\\\\"\\\\\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\\\\\"\\\\\"///\"'");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/'\\\"//\\\"'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/'\\\\\\\"//\\\\\\\"'/\\\"\"" + "'", str1, "\"\\\"/'\\\\\\\"//\\\\\\\"'/\\\"\"");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a/a4aa4a/a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a/a4aa4a/a/" + "'", str2, "/a/a4aa4a/a/");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        java.lang.String str14 = codeGenerator2.jsString("#///a// ///aa/// // ///aa/// //a//\"'//\\\"\\\"//'\"//\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //ahi!\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"a// ///aa/// // ///aa/// //a//\"'//\\\"\\\"//'\"//a// ///aa/// // ///aa/// //a///#");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'#///a// ///aa/// // ///aa/// //a//\"\\'//\\\\\"\\\\\"//\\'\"//\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //ahi!\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"a// ///aa/// // ///aa/// //a//\"\\'//\\\\\"\\\\\"//\\'\"//a// ///aa/// // ///aa/// //a///#'" + "'", str14, "'#///a// ///aa/// // ///aa/// //a//\"\\'//\\\\\"\\\\\"//\\'\"//\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //ahi!\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"\" a##aa##a \"a// ///aa/// // ///aa/// //a\" a##aa##a \"a// ///aa/// // ///aa/// //a//\"\\'//\\\\\"\\\\\"//\\'\"//a// ///aa/// // ///aa/// //a///#'");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator28.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node41, true, context43);
        codeGenerator2.addList(node24, true, context43);
        java.lang.String str47 = codeGenerator2.jsString("\"/\\\"\\\\\\\"aa\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "'\"/\\\\\"\\\\\\\\\\\\\"aa\\\\\\\\\\\\\"\\\\\"/\"'" + "'", str47, "'\"/\\\\\"\\\\\\\\\\\\\"aa\\\\\\\\\\\\\"\\\\\"/\"'");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        java.lang.String str11 = codeGenerator2.jsString("// /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ //");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"// /'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''4aa4'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''/ //\"" + "'", str11, "\"// /'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''4aa4'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''/ //\"");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        java.lang.String str11 = codeGenerator2.jsString("'\"//\"'");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        java.lang.String str15 = codeGenerator2.jsString("//'/\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'/'//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString(" ////#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#////#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//// ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'//\\'/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/\\'//'" + "'", str15, "'//\\'/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/\\'//'");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"\\\"hi!\\\"\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\\\\"hi!\\\\\"\"'" + "'", str12, "'\"\\\\\"hi!\\\\\"\"'");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator10.addList(node14, true, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node18, true, context20);
        java.lang.String str23 = codeGenerator10.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node36, true, context38);
        codeGenerator10.addList(node24, true, context38);
        codeGenerator2.addList(node6, true, context38);
        java.lang.String str43 = codeGenerator2.jsString("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addArrayList(node44);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str23, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "'\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\''" + "'", str43, "'\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\''");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/'\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\"'/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/'\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"'/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/'\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"'/\\\\\\\"\\\"\"");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator2.jsString("/\"\\\"hi!\\\"\"/");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/'//#hi!\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"hi!hi!\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"hi!hi!#//'/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'/\"\\\\\"hi!\\\\\"\"/'" + "'", str20, "'/\"\\\\\"hi!\\\\\"\"/'");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        java.lang.String str17 = codeGenerator13.jsString("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node18, false, context20);
        codeGenerator2.addList(node9, false, context20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        java.lang.String str34 = codeGenerator30.jsString("");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator2.addList(node26, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43, false);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        java.lang.String str34 = codeGenerator30.jsString("");
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node35, false, context37);
        codeGenerator19.addList(node26, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator19.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48);
        java.lang.String str51 = codeGenerator47.jsString("");
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node55, true, context57);
        codeGenerator19.addList(node43, true, context57);
        codeGenerator2.addList(node15, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator2.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"" + "'", str51, "\"\"");
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'//\\'\"\\\\\\'\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\\\\\\'\"\\'//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'//\\'\"\\\\\\'\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\\\\\\'\"\\'//'" + "'", str1, "'//\\'\"\\\\\\'\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\\\\\\'\"\\'//'");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"aa\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"aa\\\"///\"" + "'", str1, "\"///\\\"aa\\\"///\"");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        java.lang.String str19 = codeGenerator2.jsString("//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"a'\\\"//\\\"'a##aa##a\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"a##aa##ahi!\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"a##aa##aa##aa##a'\\\"//\\\"'a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str19, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("aa");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        java.lang.String str32 = codeGenerator30.jsString("aa");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, true, context37);
        codeGenerator18.addList(node26, false, context37);
        codeGenerator2.addList(node14, false, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        java.lang.String str47 = codeGenerator45.jsString("aa");
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator45.addArrayList(node53);
        java.lang.String str56 = codeGenerator45.jsString("\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator45.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator45.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator65.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator65.addList(node74);
        java.lang.String str77 = codeGenerator65.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        java.nio.charset.Charset charset81 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator82 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80, charset81);
        java.lang.String str84 = codeGenerator82.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str86 = codeGenerator82.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator82.addList(node87, true, context89);
        codeGenerator65.addList(node78, false, context89);
        codeGenerator45.addList(node61, true, context89);
        codeGenerator2.addList(node41, false, context89);
        java.lang.String str95 = codeGenerator2.jsString("/\"/\\\"'\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\''\\\"/\"/");
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"aa\"" + "'", str20, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"aa\"" + "'", str32, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"aa\"" + "'", str47, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str56, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str77, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str84, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str86, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "'/\"/\\\\\"\\'\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\'\\'\\\\\"/\"/'" + "'", str95, "'/\"/\\\\\"\\'\\\\\\\\\\\\\\\\\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\'\\'\\\\\"/\"/'");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/#\" ///aa/// \"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"/\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"///\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"/\" ///aa/// \"#/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'////\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"////'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'////\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\"////'\"" + "'", str1, "\"'////\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\"////'\"");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\"\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\"\\\"/'\"" + "'", str1, "\"'/\\\"\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\"\\\"/'\"");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15);
        java.lang.String str18 = codeGenerator14.jsString("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator14.addList(node19, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator14.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        java.lang.String str41 = codeGenerator37.jsString("");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator37.addList(node42, false, context44);
        codeGenerator14.addList(node33, false, context44);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator14.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator53.addList(node57, true, context59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node61, true, context63);
        codeGenerator14.addList(node49, true, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        codeGenerator2.addList(node18, false, context20);
        java.lang.String str23 = codeGenerator2.jsString("\"hi!\"");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator28.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        java.lang.String str40 = codeGenerator28.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator28.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node44, false, context46);
        codeGenerator2.addList(node24, true, context46);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65);
        java.lang.String str68 = codeGenerator64.jsString("");
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator64.addList(node69, false, context71);
        codeGenerator53.addList(node60, false, context71);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator53.addList(node74, false);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        java.nio.charset.Charset charset80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79, charset80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator81.addList(node82);
        java.lang.String str85 = codeGenerator81.jsString("");
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator81.addList(node86, false);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator81.addList(node89, true, context91);
        codeGenerator53.addList(node77, true, context91);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node49, (int) '4', context91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\"hi!\"'" + "'", str23, "'\"hi!\"'");
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str40, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"\"" + "'", str68, "\"\"");
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "\"\"" + "'", str85, "\"\"");
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator25.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator25.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addList(node34);
        java.lang.String str37 = codeGenerator25.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator25.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator25.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator25.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        java.lang.String str53 = codeGenerator51.jsString("aa");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator51.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator62.addList(node66, true, context68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node70, true, context72);
        java.lang.String str75 = codeGenerator62.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        java.nio.charset.Charset charset79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78, charset79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator80.addList(node81);
        java.lang.String str84 = codeGenerator80.jsString("");
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator80.addList(node85, false);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator80.addList(node88, true, context90);
        codeGenerator62.addList(node76, true, context90);
        codeGenerator51.addList(node58, false, context90);
        codeGenerator25.addList(node47, false, context90);
        codeGenerator2.addList(node21, false, context90);
        com.google.javascript.rhino.Node node96 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node96, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str37, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"aa\"" + "'", str53, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str75, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "\"\"" + "'", str84, "\"\"");
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'//\"\\'\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\"\\'\"//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'//\"\\'\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\"\\'\"//'/" + "'", str1, "/'//\"\\'\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\"\\'\"//'/");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("'/\"\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'\"/'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///aa///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///aa///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/#/" + "'", str1, "/#/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///aa///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/#/");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
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
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        java.lang.String str11 = codeGenerator2.jsString("'\"//\"'");
        java.lang.String str13 = codeGenerator2.jsString("//'#\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"\"//\"//\"//\"\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"#'//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("//#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'//\\'#\"\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\"\"\"//\"//\"//\"\"\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\"\"#\\'//'" + "'", str13, "'//\\'#\"\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\"\"\"//\"//\"//\"\"\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\"\"#\\'//'");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        java.lang.String str8 = codeGenerator2.jsString("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "'#\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"\"//\"//\"//\"\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"#'" + "'", str8, "'#\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"\"//\"//\"//\"\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"#'");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        java.lang.String str17 = codeGenerator15.jsString("aa");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator15.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator15.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator15.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator15.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator15.addAllSiblings(node33);
        java.lang.String str36 = codeGenerator15.jsString("////////");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        java.lang.String str43 = codeGenerator41.jsString("aa");
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator41.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        java.lang.String str55 = codeGenerator53.jsString("aa");
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator53.addList(node58, true, context60);
        codeGenerator41.addList(node49, false, context60);
        codeGenerator15.addList(node37, false, context60);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, 100, context60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"aa\"" + "'", str17, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"////////\"" + "'", str36, "\"////////\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"aa\"" + "'", str43, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"aa\"" + "'", str55, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"#/#/aa/#/#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        java.lang.String str16 = codeGenerator14.jsString("aa");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator14.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator14.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator14.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator14.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("aa");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator39.addArrayList(node47);
        java.lang.String str50 = codeGenerator39.jsString("4aa4");
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator55.addList(node58, false, context60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator55.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator55.addList(node64);
        java.lang.String str67 = codeGenerator55.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator55.addList(node68, true);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node71, false, context73);
        codeGenerator39.addList(node51, false, context73);
        codeGenerator14.addList(node35, true, context73);
        codeGenerator2.addList(node10, false, context73);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator2.addList(node78);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/'\\'\\\\\\'\"/#hi!\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"hi!hi!#/\"\\\\\\'\\''/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"aa\"" + "'", str41, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"4aa4\"" + "'", str50, "\"4aa4\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str67, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        java.lang.String str13 = codeGenerator2.jsString("//");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        java.lang.String str35 = codeGenerator31.jsString("");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node36, false, context38);
        codeGenerator17.addList(node27, false, context38);
        codeGenerator2.addList(node13, false, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42);
        java.lang.String str45 = codeGenerator2.jsString("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "'\"hi!\"'" + "'", str45, "'\"hi!\"'");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator14.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator14.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator14.addList(node29, true);
        java.lang.String str33 = codeGenerator14.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node34, false, context36);
        codeGenerator2.addList(node10, false, context36);
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str33, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        java.lang.String str15 = codeGenerator2.jsString("4aa4");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("4aa4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"4aa4\"" + "'", str15, "\"4aa4\"");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        java.lang.String str35 = codeGenerator31.jsString("");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node36, false, context38);
        codeGenerator17.addList(node27, false, context38);
        codeGenerator2.addList(node13, false, context38);
        java.lang.String str43 = codeGenerator2.jsString("\"\\\"#/#/aa/#/#\\\"\"");
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "'\"\\\\\"#/#/aa/#/#\\\\\"\"'" + "'", str43, "'\"\\\\\"#/#/aa/#/#\\\\\"\"'");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("aa");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator18.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator18.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator18.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        java.lang.String str45 = codeGenerator43.jsString("aa");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator43.addArrayList(node51);
        java.lang.String str54 = codeGenerator43.jsString("4aa4");
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator59.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator59.addList(node68);
        java.lang.String str71 = codeGenerator59.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator59.addList(node72, true);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator59.addList(node75, false, context77);
        codeGenerator43.addList(node55, false, context77);
        codeGenerator18.addList(node39, true, context77);
        codeGenerator2.addList(node14, false, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/##/##/#/\"/44/\"#/#/aa/#/##/##/##/#/aa/#/##/#/aa/#/#\"/44/\"//#/#/aa/#/##/#/aa/#/#\"/44/\"#/#/aa/#/##/##/#\"/44/\"/#/##/##/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"aa\"" + "'", str20, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"aa\"" + "'", str45, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"4aa4\"" + "'", str54, "\"4aa4\"");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str71, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
        java.lang.String str13 = codeGenerator2.jsString("//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("4a//a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'" + "'", str13, "'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"/\"/" + "'", str2, "/\"/\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"/\"/");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node14, false, context16);
        codeGenerator2.addList(node7, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        java.lang.String str29 = codeGenerator25.jsString("");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node30, false, context32);
        codeGenerator2.addList(node21, false, context32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator41.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node49, true, context51);
        codeGenerator2.addList(node37, true, context51);
        com.google.javascript.rhino.Node node54 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        java.lang.String str21 = codeGenerator2.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator30.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator30.addList(node39);
        java.lang.String str42 = codeGenerator30.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        java.lang.String str49 = codeGenerator47.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str51 = codeGenerator47.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator47.addList(node52, true, context54);
        codeGenerator30.addList(node43, false, context54);
        codeGenerator25.addList(node26, false, context54);
        codeGenerator2.addList(node22, true, context54);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str21, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str42, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str49, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str51, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        java.lang.String str27 = codeGenerator23.jsString("");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node35, false, context37);
        codeGenerator23.addList(node28, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator23.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        java.lang.String str50 = codeGenerator46.jsString("");
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator46.addList(node51, false, context53);
        codeGenerator23.addList(node42, false, context53);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator23.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63, false);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator62.addList(node66, true, context68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node70, true, context72);
        codeGenerator23.addList(node58, true, context72);
        codeGenerator2.addList(node19, true, context72);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator2.addList(node76, false);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\"" + "'", str50, "\"\"");
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/#/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///aa///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/#/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        java.lang.String str16 = codeGenerator2.jsString("4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addList(node29);
        java.lang.String str32 = codeGenerator20.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        java.lang.String str39 = codeGenerator37.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str41 = codeGenerator37.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator37.addList(node42, true, context44);
        codeGenerator20.addList(node33, false, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "'4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4'" + "'", str16, "'4/\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"//\"\\\\\"#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#\\\\\"\"/4'");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str32, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str39, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str41, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        java.lang.String str13 = codeGenerator2.jsString("\"//aa//\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"//aa//\"'" + "'", str13, "'\"//aa//\"'");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        java.lang.String str13 = codeGenerator2.jsString("\"'\\\"\\\\'//\\\\\\\\\\\"\\\\\\\\\\\"//\\\\'\\\"'\"");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\'\\\\\"\\'\"'" + "'", str13, "'\"\\'\\\\\"\\\\\\\\\\'//\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\'\\\\\"\\'\"'");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        java.nio.charset.Charset charset5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4, charset5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator6.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator6.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator6.addList(node15);
        java.lang.String str18 = codeGenerator6.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        java.lang.String str25 = codeGenerator23.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str27 = codeGenerator23.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator23.addList(node28, true, context30);
        codeGenerator6.addList(node19, false, context30);
        codeGenerator1.addList(node2, false, context30);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator40.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator40.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator40.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addList(node60, true);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator59.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator59.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node68, false, context70);
        codeGenerator40.addList(node55, true, context70);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node36, (int) (short) 0, context70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str18, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str25, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str27, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\\'/\"\\\\\\\\\"hi!\\\\\\\\\"\"/\\''/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'\\'/\"\\\\\\\\\"hi!\\\\\\\\\"\"/\\''//" + "'", str1, "//'\\'/\"\\\\\\\\\"hi!\\\\\\\\\"\"/\\''//");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        java.lang.String str21 = codeGenerator2.jsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str21, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("##//\"/\\\"//\\\"/\"'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"hi!'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"\"/\\\"//\\\"/\"//hi!//\"/\\\"//\\\"/\"'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"hi!'\"/\\\\\"//\\\\\"/\"'\"/\\\"//\\\"/\"\"/\\\"//\\\"/\"//##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        java.lang.String str22 = codeGenerator2.jsString("/\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"/");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'/\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"/'" + "'", str22, "'/\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"/'");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"\\\"/'\\\\\\\"//\\\\\\\"'/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
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
        java.lang.String str17 = codeGenerator15.jsString("aa");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        java.lang.String str26 = codeGenerator24.jsString("aa");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator24.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator24.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator24.addAllSiblings(node42);
        java.lang.String str45 = codeGenerator24.jsString("////////");
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        java.lang.String str52 = codeGenerator50.jsString("aa");
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, true);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        java.lang.String str64 = codeGenerator62.jsString("aa");
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node67, true, context69);
        codeGenerator50.addList(node58, false, context69);
        codeGenerator24.addList(node46, false, context69);
        codeGenerator15.addList(node20, false, context69);
        codeGenerator2.addList(node11, false, context69);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator2.addArrayList(node75);
        com.google.javascript.rhino.Node node77 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"aa\"" + "'", str17, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"aa\"" + "'", str26, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"////////\"" + "'", str45, "\"////////\"");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"aa\"" + "'", str52, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"aa\"" + "'", str64, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4///\"hi!\"//#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#hi!/\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/##/'\"//\"'/4a##aa##a4/'\"//\"'/#//\"hi!\"///4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4///\"hi!\"//#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#hi!/\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/##/'\"//\"'/4a##aa##a4/'\"//\"'/#//\"hi!\"///4/" + "'", str2, "/4///\"hi!\"//#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#hi!/\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/#/\"\\\"\\\"\"//\"\\\"\\\"\"/#/'\"//\"'/4a##aa##a4/'\"//\"'/##/'\"//\"'/4a##aa##a4/'\"//\"'/#//\"hi!\"///4/");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node14, false, context16);
        codeGenerator2.addList(node7, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        java.lang.String str29 = codeGenerator25.jsString("");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node30, false, context32);
        codeGenerator2.addList(node21, false, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("aa");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node48, true, context50);
        codeGenerator2.addList(node35, true, context50);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addList(node57, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"aa\"" + "'", str41, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator21.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node30, false, context32);
        codeGenerator2.addList(node17, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addArrayList(node35);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/#/##/#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/#/##/#/\"" + "'", str1, "\"/#/##/#/\"");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
        java.lang.String str24 = codeGenerator2.jsString("//");
        java.lang.String str26 = codeGenerator2.jsString("a4aa4a");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"//\"" + "'", str24, "\"//\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"a4aa4a\"" + "'", str26, "\"a4aa4a\"");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.String str14 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/aa/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.String str12 = codeGenerator2.jsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator22.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node35, true, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) (short) -1, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        java.lang.String str17 = codeGenerator2.jsString("\"'\\\"//\\\"'\"");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//a4aa4a//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\"\\'\\\\\"//\\\\\"\\'\"'" + "'", str17, "'\"\\'\\\\\"//\\\\\"\\'\"'");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        java.lang.String str16 = codeGenerator14.jsString("aa");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node19, true, context21);
        codeGenerator2.addList(node10, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40);
        java.lang.String str43 = codeGenerator39.jsString("");
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator39.addList(node44, false, context46);
        codeGenerator28.addList(node35, false, context46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator28.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        java.lang.String str60 = codeGenerator56.jsString("");
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node64, true, context66);
        codeGenerator28.addList(node52, true, context66);
        codeGenerator2.addList(node24, false, context66);
        java.lang.String str71 = codeGenerator2.jsString("\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"");
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator2.addArrayList(node72);
        java.lang.String str75 = codeGenerator2.jsString("'/\"  \"/'");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "'\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\"'" + "'", str71, "'\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\"'");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"'/\\\"  \\\"/'\"" + "'", str75, "\"'/\\\"  \\\"/'\"");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/#/aa/#/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/#/aa/#/#/" + "'", str2, "/#/#/aa/#/#/");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        java.lang.String str20 = codeGenerator16.jsString("");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator2.addList(node12, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        java.lang.String str32 = codeGenerator30.jsString("aa");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, true, context37);
        codeGenerator2.addList(node26, false, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator2.addList(node40);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"aa\"" + "'", str32, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        java.lang.Class<?> wildcardClass8 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node19, false, context21);
        codeGenerator9.addList(node12, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        java.lang.String str32 = codeGenerator28.jsString("");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node40, false, context42);
        codeGenerator28.addList(node33, false, context42);
        codeGenerator9.addList(node24, false, context42);
        codeGenerator2.addList(node5, true, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("'\"\\\\\"\\\\\\\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\\\\\\\"\\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        java.lang.String str15 = codeGenerator2.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        java.lang.String str24 = codeGenerator20.jsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        java.lang.String str41 = codeGenerator39.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator46.addList(node49, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        java.lang.String str69 = codeGenerator65.jsString("");
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node77, false, context79);
        codeGenerator65.addList(node70, false, context79);
        codeGenerator46.addList(node61, false, context79);
        codeGenerator39.addList(node42, true, context79);
        codeGenerator2.addList(node35, true, context79);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addList(node85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator2.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator2.addList(node89, false);
        com.google.javascript.rhino.Node node92 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node92, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str41, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("aa");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator18.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator18.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator18.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        java.lang.String str45 = codeGenerator43.jsString("aa");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator43.addArrayList(node51);
        java.lang.String str54 = codeGenerator43.jsString("4aa4");
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator59.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator59.addList(node68);
        java.lang.String str71 = codeGenerator59.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator59.addList(node72, true);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator59.addList(node75, false, context77);
        codeGenerator43.addList(node55, false, context77);
        codeGenerator18.addList(node39, true, context77);
        codeGenerator2.addList(node14, false, context77);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator2.addArrayList(node82);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"aa\"" + "'", str20, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"aa\"" + "'", str45, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"4aa4\"" + "'", str54, "\"4aa4\"");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str71, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }
}

