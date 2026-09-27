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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"hi!\\\"\"", '#', "hi!", "\"\\\"hi!\\\"\"", "\"\\\"hi!\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#" + "'", str6, "#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#" + "'", str1, "#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"hi!\"", '4', "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'", "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"", "hi!", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4" + "'", str6, "4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node3, (int) 'a', context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#", "", "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.Class<?> wildcardClass5 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"hi!\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str2, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//" + "'", str2, "//");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node3, (int) (short) 100, context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"aa\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        java.lang.String str13 = codeGenerator9.jsString("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator9.addList(node14, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node5, (int) (short) 100, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, false, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str1, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/" + "'", str1, "/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"" + "'", str1, "\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"" + "'", str1, "\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/aa/" + "'", str1, "/aa/");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/" + "'", str1, "/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"" + "'", str1, "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (short) 0, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\"/" + "'", str2, "/\"\"/");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("'\"\\\\\"hi!\\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node16, (int) ' ', context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//\"/" + "'", str2, "/\"//\"/");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '#', "", "\"\\\"hi!\\\"\"", "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##" + "'", str6, "##");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\"/" + "'", str1, "/\"//\"/");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator10.addList(node14, true, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"aa\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"aa\\\"\"" + "'", str1, "\"\\\"aa\\\"\"");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator14.addList(node18, true, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (byte) 100, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        java.lang.String str19 = codeGenerator17.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str21 = codeGenerator17.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator17.addList(node22, true, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str19, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str21, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (short) 100, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node19, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) '4', context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/aa/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//aa//" + "'", str2, "//aa//");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15);
        java.lang.String str18 = codeGenerator14.jsString("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node19, false, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (byte) 100, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("aa");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"//\"'", '#', "\"//\"", "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"", "\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#" + "'", str6, "#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        java.lang.String str21 = codeGenerator17.jsString("");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node29, false, context31);
        codeGenerator17.addList(node22, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////" + "'", str2, "////");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        java.lang.String str15 = codeGenerator13.jsString("aa");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node22, true, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"aa\"" + "'", str15, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/" + "'", str2, "/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa" + "'", str1, "aa");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6, charset7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator8.addList(node12, true, context14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        java.lang.String str17 = codeGenerator15.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str19 = codeGenerator15.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str17, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str19, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\"///" + "'", str1, "///\"\"///");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\"//\\\"'\"/" + "'", str1, "/\"'\\\"//\\\"'\"/");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) (short) 1, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//aa//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//aa//" + "'", str1, "//aa//");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str22 = codeGenerator18.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator18.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) (byte) 10, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str20, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str22, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"aa\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//aa//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///aa///" + "'", str2, "///aa///");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("///aa///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//" + "'", str2, "//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str1, "\"/\\\"//\\\"/\"");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"'\\\"//\\\"'\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"//\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'\\\"//\\\"'\"/" + "'", str2, "/\"'\\\"//\\\"'\"/");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"" + "'", str1, "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.String str17 = codeGenerator15.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str19 = codeGenerator15.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (byte) 100, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str17, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str19, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (byte) 100, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/aa/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node5, (-1), context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"aa\"", '4', "", "'\"//\"'", "\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4aa4" + "'", str6, "4aa4");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node27, false, context29);
        codeGenerator17.addList(node20, true, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, 100, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node17, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (byte) 0, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node26, false, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5, context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        java.lang.Class<?> wildcardClass12 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4aa4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4aa4/" + "'", str2, "/4aa4/");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node21, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, (int) (short) 10, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//\"//" + "'", str1, "//\"//\"//");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator16.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, 10, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//" + "'", str1, "//#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("///aa///", ' ', "\"aa\"", "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", "\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ///aa/// " + "'", str6, " ///aa/// ");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
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
        codeGenerator15.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator15.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator15.addList(node28, true, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) '#', context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        java.lang.String str20 = codeGenerator18.jsString("aa");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) '4', context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"aa\"" + "'", str20, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        java.lang.Class<?> wildcardClass16 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/4aa4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node19, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        java.lang.Class<?> wildcardClass15 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5, context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\\\\\"hi!\\\\\"\"'", '#', "#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#", "\"'\\\"//\\\"'\"", "\"\\\"hi!\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"'\\\"//\\\"'\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#hi!\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!##hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"'\\\"//\\\"'\"#" + "'", str6, "#\"'\\\"//\\\"'\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#hi!\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!##hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"'\\\"//\\\"'\"#");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/" + "'", str1, "/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//" + "'", str2, "//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"/" + "'", str2, "/\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"/");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str1, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\\\\"hi!\\\\\"\"'" + "'", str12, "'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/" + "'", str1, "/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\"" + "'", str13, "\"//\"");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str19, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///aa///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/aa/", '#', "\"\\\"hi!\\\"\"", "##", "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/aa/#" + "'", str6, "#/aa/#");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.jsString("'\"//\"'");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        java.lang.String str13 = codeGenerator9.jsString("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, false, context23);
        codeGenerator9.addList(node14, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str5, "\"'\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        java.lang.Class<?> wildcardClass10 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///aa///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addJsString("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4aa4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4aa4/" + "'", str1, "/4aa4/");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##" + "'", str1, "##");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"" + "'", str1, "\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/\"\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"//\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"aa\"", 'a', "##", "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"", "/4aa4/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a##aa##a" + "'", str6, "a##aa##a");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"" + "'", str1, "\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("a##aa##a");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        java.lang.String str21 = codeGenerator19.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str23 = codeGenerator19.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node24, true, context26);
        codeGenerator2.addList(node15, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node29, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str21, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str23, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"aa\"", '#', "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'", "\"\\\"'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"'\\\"\"", "/\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'aa'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'#" + "'", str6, "#'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'aa'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'#");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/" + "'", str1, "/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///" + "'", str1, "///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"hi!\\\"\"//" + "'", str1, "//\"\\\"hi!\\\"\"//");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, (int) (short) -1, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, 100, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4aa4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4aa4" + "'", str1, "4aa4");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"//\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"//\"'/" + "'", str1, "/'\"//\"'/");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"/" + "'", str2, "/\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"/");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" ///aa/// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" ///aa/// \"" + "'", str1, "\" ///aa/// \"");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node17, (int) ' ', context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        java.lang.String str26 = codeGenerator22.jsString("");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node27, false, context29);
        codeGenerator11.addList(node18, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) (short) 10, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"" + "'", str26, "\"\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        codeGenerator2.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str19, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
            codeGenerator2.addExpr(node9, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"//\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        java.lang.Class<?> wildcardClass5 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"aa\"", ' ', "\"aa\"", "\"hi!\"", "////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " \"aa\"aa\"aa\" " + "'", str6, " \"aa\"aa\"aa\" ");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15);
        java.lang.String str18 = codeGenerator14.jsString("");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator14.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node22, true, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"" + "'", str1, "\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"\\\\\"hi!\\\\\"\"'" + "'", str1, "'\"\\\\\"hi!\\\\\"\"'");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/aa/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node22, true, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) (short) -1, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"" + "'", str1, "\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        java.lang.String str21 = codeGenerator19.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str23 = codeGenerator19.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node24, true, context26);
        codeGenerator2.addList(node15, false, context26);
        java.lang.Class<?> wildcardClass29 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str21, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str23, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.lang.String str13 = codeGenerator11.jsString("aa");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator22.addList(node26, true, context28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node30, true, context32);
        java.lang.String str35 = codeGenerator22.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41);
        java.lang.String str44 = codeGenerator40.jsString("");
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node48, true, context50);
        codeGenerator22.addList(node36, true, context50);
        codeGenerator11.addList(node18, false, context50);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) 'a', context50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"aa\"" + "'", str13, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str35, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"" + "'", str44, "\"\"");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4aa4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4aa4\"/" + "'", str1, "/\"4aa4\"/");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node21, true, context23);
        java.lang.String str26 = codeGenerator13.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        java.lang.String str35 = codeGenerator31.jsString("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node39, true, context41);
        codeGenerator13.addList(node27, true, context41);
        codeGenerator2.addList(node9, false, context41);
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node45, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str26, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"//\"/", '4', "\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"", "\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"", "\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4" + "'", str6, "4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        java.lang.String str25 = codeGenerator21.jsString("");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node33, false, context35);
        codeGenerator21.addList(node26, false, context35);
        codeGenerator2.addList(node17, false, context35);
        java.lang.Class<?> wildcardClass39 = context35.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"/" + "'", str1, "/\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"/");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        com.google.javascript.jscomp.CodeGenerator.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"'//\\\\\\\\'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\\\\\\'//'\\\"/\"" + "'", str1, "\"/\\\"'//\\\\\\\\'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\\\\\\'//'\\\"/\"");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\"/" + "'", str1, "/\"//\"/");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
            codeGenerator2.addJsString("/\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"\\\"hi!\\\"\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"" + "'", str1, "\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("#\"'\\\"//\\\"'\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#hi!\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!##hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"'\\\"//\\\"'\"#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("#'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'aa'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node25, false, context27);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\"\\'\\\\\"//\\\\\"\\'\"'" + "'", str17, "'\"\\'\\\\\"//\\\\\"\\'\"'");
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (-1), context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (-1), context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"", 'a', "hi!", "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a" + "'", str6, "ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        java.lang.String str14 = codeGenerator12.jsString("aa");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        java.lang.String str26 = codeGenerator24.jsString("aa");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node29, true, context31);
        codeGenerator12.addList(node20, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node8, (int) '4', context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"aa\"" + "'", str14, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"aa\"" + "'", str26, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/" + "'", str1, "/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a##aa##a", '4', "/\"\"/", "//#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#//", "//\"\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4a##aa##a4" + "'", str6, "4a##aa##a4");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        java.lang.Class<?> wildcardClass33 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.String str6 = codeGenerator2.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, false, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"//\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\"\\'\\\\\"//\\\\\"\\'\"'" + "'", str17, "'\"\\'\\\\\"//\\\\\"\\'\"'");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node33, false, context35);
        codeGenerator23.addList(node26, true, context35);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator23.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        java.lang.String str48 = codeGenerator44.jsString("");
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator53.addList(node56, false, context58);
        codeGenerator44.addList(node49, false, context58);
        codeGenerator23.addList(node40, false, context58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20, context58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\"" + "'", str48, "\"\"");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"'//\\\\\\\\'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\\\\\\'//'\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'aa'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'aa'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'#" + "'", str1, "#'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'aa'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'#");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//\"\"//", ' ', "//#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//", "\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"", "///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ////#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#////#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//// " + "'", str6, " ////#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#////#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#//// ");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/4aa4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'/" + "'", str2, "/'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'/");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"'\\\"//\\\"'\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        java.lang.String str21 = codeGenerator19.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str23 = codeGenerator19.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node24, true, context26);
        codeGenerator2.addList(node15, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node29, (int) (short) 1, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str21, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str23, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        java.lang.String str21 = codeGenerator19.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node36, false, context38);
        codeGenerator26.addList(node29, true, context38);
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
        codeGenerator26.addList(node41, false, context59);
        codeGenerator19.addList(node22, true, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, 10, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str21, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"" + "'", str49, "\"\"");
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        java.lang.String str17 = codeGenerator13.jsString("");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node18, false, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node18, false, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (-1), context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("aa", ' ', "\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"", "/'\"//\"'/", "4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " aa " + "'", str6, " aa ");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"4aa4\"/", ' ', "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''", "\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"", "#\"'\\\"//\\\"'\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#hi!\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!##hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"'\\\"//\\\"'\"#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ " + "'", str6, " /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ ");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\'\\\\\"//\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"\\'\\\\\"//\\\\\"\\'\"'/" + "'", str1, "/'\"\\'\\\\\"//\\\\\"\\'\"'/");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//" + "'", str2, "//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"//\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/aa/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//aa//" + "'", str1, "//aa//");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ " + "'", str1, " /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ ");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#\"'\\\"//\\\"'\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#hi!\"\\\"hi!\\\"\"\"\\\"hi!\\\"\"#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!##hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#\"'\\\"//\\\"'\"#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"" + "'", str1, "\"#\\\"'\\\\\\\"//\\\\\\\"'\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"\\\"\\\\\\\"hi!\\\\\\\"\\\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!##hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\\\"'\\\\\\\"//\\\\\\\"'\\\"#\"");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"\\\\\"\\\\\"\"'" + "'", str10, "'\"\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.jsString("'\"//\"'");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        java.lang.String str12 = codeGenerator10.jsString("aa");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator10.addList(node16);
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
        codeGenerator10.addList(node18, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node6, (int) (byte) 1, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str5, "\"'\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"aa\"" + "'", str12, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"aa\"" + "'", str24, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"aa\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"aa\\\"\"/" + "'", str1, "/\"\\\"aa\\\"\"/");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\"\\'\\\\\"//\\\\\"\\'\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'\"\\'\\\\\"//\\\\\"\\'\"'//" + "'", str1, "//'\"\\'\\\\\"//\\\\\"\\'\"'//");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        java.lang.String str29 = codeGenerator27.jsString("aa");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator38.addList(node42, true, context44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator38.addList(node46, true, context48);
        java.lang.String str51 = codeGenerator38.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
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
        codeGenerator38.addList(node52, true, context66);
        codeGenerator27.addList(node34, false, context66);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node23, (-1), context66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"aa\"" + "'", str29, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str51, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\"//" + "'", str2, "//\"\"//");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"/" + "'", str1, "/\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"/");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
            codeGenerator2.addJsString("'\"\\'\\\\\"//\\\\\"\\'\"'");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"'\\\"/#hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"hi!hi!#/\\\"'\"/", 'a', "/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/", "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//#hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!hi!#//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//a" + "'", str6, "a//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//#hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/hi!hi!#//'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'//a");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node22, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str15, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\" ///aa/// \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        codeGenerator2.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4a##aa##a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str19, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        java.lang.String str10 = codeGenerator2.jsString("\"//\"");
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"//\"'" + "'", str10, "'\"//\"'");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//" + "'", str1, "//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        java.lang.String str14 = codeGenerator12.jsString("aa");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator23.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node31, true, context33);
        java.lang.String str36 = codeGenerator23.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42);
        java.lang.String str45 = codeGenerator41.jsString("");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node49, true, context51);
        codeGenerator23.addList(node37, true, context51);
        codeGenerator12.addList(node19, false, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node8, (int) (short) -1, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"aa\"" + "'", str14, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str36, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"/" + "'", str1, "/\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"/");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        java.lang.String str21 = codeGenerator2.jsString("\"'\\\"//\\\"'\"");
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'" + "'", str19, "'//#hi!\"\\\\\"hi!\\\\\"\"hi!hi!\"\\\\\"hi!\\\\\"\"hi!hi!#//'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"\\'\\\\\"//\\\\\"\\'\"'" + "'", str21, "'\"\\'\\\\\"//\\\\\"\\'\"'");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\"" + "'", str1, "\"//\"");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str1, "\"'\\\"//\\\"'\"");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'/" + "'", str2, "/'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'/");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node43, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"\"" + "'", str34, "\"\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4/" + "'", str2, "/4/\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"//\"\\\"#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#\\\"\"/4/");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", ' ', "/\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"/", "\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"", "'\"\\\\\"hi!\\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'/" + "'", str1, "/'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'/");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("/aa/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        java.lang.String str21 = codeGenerator19.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str23 = codeGenerator19.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node24, true, context26);
        codeGenerator2.addList(node15, false, context26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        java.lang.String str36 = codeGenerator32.jsString("");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node40, true, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node29, context42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str21, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str23, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/4aa4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4aa4/" + "'", str1, "/4aa4/");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"//\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node21, true, context23);
        java.lang.String str26 = codeGenerator13.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        java.lang.String str35 = codeGenerator31.jsString("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node39, true, context41);
        codeGenerator13.addList(node27, true, context41);
        codeGenerator2.addList(node9, false, context41);
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str26, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'//\"\\\\\"hi!\\\\\"\"//'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/4aa4/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\'\\\\\"//\\\\\"\\'\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"" + "'", str1, "\"'\\\"\\\\'\\\\\\\\\\\"//\\\\\\\\\\\"\\\\'\\\"'\"");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        codeGenerator2.addAllSiblings(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6, charset7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        java.lang.String str23 = codeGenerator19.jsString("");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node24, false, context26);
        codeGenerator8.addList(node15, false, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\"");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        codeGenerator2.addList(node19, false);
        java.lang.Class<?> wildcardClass22 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addJsString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/" + "'", str2, "/'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'/");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'", 'a', "//", "///\"\"///", "//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a///\"\"////////////////\"\"/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////hi!///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\"\"//////////////\"\"///a" + "'", str6, "a///\"\"////////////////\"\"/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////hi!///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////\"\"//////////////\"\"///a");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"\\\"aa\\\"\"/", ' ', "", "/'\"\\'\\\\\"//\\\\\"\\'\"'/", "/\"4aa4\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //\"4aa4\"/aa/\"4aa4\"// " + "'", str6, " //\"4aa4\"/aa/\"4aa4\"// ");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        java.lang.Class<?> wildcardClass23 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.Class<?> wildcardClass34 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str18, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str25, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str27, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("##");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
            codeGenerator2.addLeftExpr(node14, (int) 'a', context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'" + "'", str13, "'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str1, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node21, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.jsString("");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator74.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator74.addList(node83);
        java.lang.String str86 = codeGenerator74.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator74.addList(node87, true);
        com.google.javascript.rhino.Node node90 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context92 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node90, false, context92);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node70, (int) (byte) 10, context92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str86, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context92 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context92.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/" + "'", str1, "/#hi!\"\\\"hi!\\\"\"hi!hi!\"\\\"hi!\\\"\"hi!hi!#/");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        java.lang.String str34 = codeGenerator32.jsString("aa");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node37, true, context39);
        codeGenerator20.addList(node28, false, context39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator46.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        java.lang.String str61 = codeGenerator57.jsString("");
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator57.addList(node62, false, context64);
        codeGenerator46.addList(node53, false, context64);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator46.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        java.lang.String str78 = codeGenerator74.jsString("");
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator74.addList(node79, false);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node82, true, context84);
        codeGenerator46.addList(node70, true, context84);
        codeGenerator20.addList(node42, false, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"aa\"" + "'", str22, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"aa\"" + "'", str34, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"\"" + "'", str61, "\"\"");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "\"\"" + "'", str78, "\"\"");
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        java.lang.String str48 = codeGenerator2.jsString("//\"\\\"hi!\\\"\"//");
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node49, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "'//\"\\\\\"hi!\\\\\"\"//'" + "'", str48, "'//\"\\\\\"hi!\\\\\"\"//'");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'" + "'", str1, "'\"#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!##hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#\\\\\"\\'\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\'\\\\\"#\"'");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"aa\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"aa\\\"\"" + "'", str1, "\"\\\"aa\\\"\"");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/aa/" + "'", str2, "/aa/");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#/aa/#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#/aa/#" + "'", str1, "#/aa/#");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator13.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator13.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator13.addList(node26, true, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator13.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        java.lang.String str38 = codeGenerator36.jsString("aa");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, false);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator47.addList(node51, true, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node55, true, context57);
        java.lang.String str60 = codeGenerator47.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66);
        java.lang.String str69 = codeGenerator65.jsString("");
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator65.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator65.addList(node73, true, context75);
        codeGenerator47.addList(node61, true, context75);
        codeGenerator36.addList(node43, false, context75);
        codeGenerator13.addList(node32, true, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"aa\"" + "'", str38, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str60, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        java.lang.String str25 = codeGenerator23.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50);
        java.lang.String str53 = codeGenerator49.jsString("");
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator58.addList(node61, false, context63);
        codeGenerator49.addList(node54, false, context63);
        codeGenerator30.addList(node45, false, context63);
        codeGenerator23.addList(node26, true, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node19, (int) (short) 10, context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str25, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"\"" + "'", str53, "\"\"");
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.Class<?> wildcardClass70 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"aa\"" + "'", str16, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\"\"" + "'", str60, "\"\"");
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\\\\\"hi!\\\\\"\"'", 'a', "a##aa##a", "'\"//\"'", "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a'\"//\"'a##aa##a\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"a##aa##ahi!\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"a##aa##aa##aa##a'\"//\"'a" + "'", str6, "a'\"//\"'a##aa##a\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"a##aa##ahi!\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"a##aa##aa##aa##a'\"//\"'a");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"\\\"\"//" + "'", str2, "//\"\\\"\\\"\"//");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("4'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\\\"//\\\"//\\\"//\\\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"#\"" + "'", str1, "\"#\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\\\"//\\\"//\\\"//\\\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"#\"");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"//" + "'", str2, "//\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"//");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
            codeGenerator2.add("/'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'" + "'", str13, "'//\\'\"/#hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"hi!hi!#/\"\\'//'");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        java.lang.String str38 = codeGenerator36.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str40 = codeGenerator36.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator36.addList(node41, true, context43);
        codeGenerator19.addList(node32, false, context43);
        codeGenerator14.addList(node15, false, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) '#', context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str31, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str38, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str40, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/#\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"\"//\"//\"//\"\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"#/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        java.lang.String str19 = codeGenerator17.jsString("aa");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addArrayList(node25);
        java.lang.String str28 = codeGenerator17.jsString("4aa4");
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node36, false, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator33.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator33.addList(node42);
        java.lang.String str45 = codeGenerator33.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator33.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node49, false, context51);
        codeGenerator17.addList(node29, false, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, (int) (short) 100, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"aa\"" + "'", str19, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"4aa4\"" + "'", str28, "\"4aa4\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str45, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'/" + "'", str2, "/'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'/");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/aa/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/aa/" + "'", str1, "/aa/");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        com.google.javascript.rhino.Node node91 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node91, 100);
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("\"#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str23, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'//\"\\\\\"hi!\\\\\"\"//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"" + "'", str1, "\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator36.addList(node39, false, context41);
        codeGenerator29.addList(node32, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator29.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        java.lang.String str52 = codeGenerator50.jsString("aa");
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node55, true, context57);
        codeGenerator29.addList(node46, false, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node26, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"aa\"" + "'", str52, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\"\\\\\"/\\\\\\\\\\\\\"//\\\\\\\\\\\\\"/\\\\\"\"/'", '#', "\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"", "\" ///aa/// \"", "/\"\\\"\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\" ///aa/// \"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"/\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"///\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"/\" ///aa/// \"#" + "'", str6, "#\" ///aa/// \"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"/\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"///\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"//\"\\\"\\\"\"//\"\\\"\\\"\"/\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"\"'//\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"//'\"/\" ///aa/// \"#");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'//\"\"//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'//\\\"\\\"//'\"" + "'", str1, "\"'//\\\"\\\"//'\"");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
            codeGenerator2.addExpr(node23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/aa/#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#/aa/#/" + "'", str1, "/#/aa/#/");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"/#hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"hi!hi!#/\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"//\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.Class<?> wildcardClass35 = codeGenerator2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        codeGenerator2.addList(node19, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.String str17 = codeGenerator2.jsString("'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str17, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"//" + "'", str1, "//\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"//");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"'//\\\\\\\\'\\\\\\\"/#hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\\\\\\'//'\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        java.lang.Class<?> wildcardClass17 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str14, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addJsString("//'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "'//\"\"//'", "//\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"//", "/'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a##aa##a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a##aa##a\"" + "'", str1, "\"a##aa##a\"");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str6 = codeGenerator2.jsString("'\"\\\\\"hi!\\\\\"\"'");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        java.lang.String str15 = codeGenerator13.jsString("aa");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node18, true, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, (int) 'a', context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str6, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"aa\"" + "'", str15, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//////" + "'", str1, "//////");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        java.lang.String str39 = codeGenerator37.jsString("aa");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node42, true, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node33, 0, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str15, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"aa\"" + "'", str39, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str13, "'\"\\\\\"\\'\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\'\\\\\"\"'");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        java.lang.String str25 = codeGenerator21.jsString("");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node33, false, context35);
        codeGenerator21.addList(node26, false, context35);
        codeGenerator2.addList(node17, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a/" + "'", str1, "/ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a/");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node26, false, context28);
        codeGenerator16.addList(node19, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36);
        java.lang.String str39 = codeGenerator35.jsString("");
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node47, false, context49);
        codeGenerator35.addList(node40, false, context49);
        codeGenerator16.addList(node31, false, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'" + "'", str12, "'\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\"'");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass23 = context20.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" aa ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        codeGenerator18.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node31, true, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator18.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        java.lang.String str43 = codeGenerator41.jsString("aa");
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator52.addList(node56, true, context58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator52.addList(node60, true, context62);
        java.lang.String str65 = codeGenerator52.jsString("\"/#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#/\"");
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addList(node71);
        java.lang.String str74 = codeGenerator70.jsString("");
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator70.addList(node75, false);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node78, true, context80);
        codeGenerator52.addList(node66, true, context80);
        codeGenerator41.addList(node48, false, context80);
        codeGenerator18.addList(node37, true, context80);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) (short) -1, context80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4aa4\"" + "'", str13, "\"4aa4\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"aa\"" + "'", str43, "\"aa\"");
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'" + "'", str65, "'\"/#hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"hi!hi!#/\"'");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\"\"" + "'", str74, "\"\"");
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, true);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"aa\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" /'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''4aa4'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''/ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6, charset7);
        java.lang.String str10 = codeGenerator8.jsString("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node25, false, context27);
        codeGenerator15.addList(node18, true, context27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35);
        java.lang.String str38 = codeGenerator34.jsString("");
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator43.addList(node46, false, context48);
        codeGenerator34.addList(node39, false, context48);
        codeGenerator15.addList(node30, false, context48);
        codeGenerator8.addList(node11, true, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5, context48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str4, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str10, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"/" + "'", str2, "/\"//#hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!\\\"\\\\\\\"hi!\\\\\\\"\\\"hi!hi!#//\"/");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"aa\"", '4', "/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/", "ahi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!hi!hi!hi!hi!'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"''\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'hi!a", "'/\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\'/'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/aa/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/4" + "'", str6, "4/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/aa/\"'//\\\\'\\\"/#hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"hi!hi!#/\\\"\\\\'//'\"/4");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\\\\\"/#hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"hi!hi!#/\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node31, false, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, 0, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'" + "'", str27, "'\"\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"\"'");
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.String str4 = codeGenerator2.jsString("aa");
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        java.lang.String str11 = codeGenerator2.jsString("'\"//\"'");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"aa\"" + "'", str4, "\"aa\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"'\\\"//\\\"'\"" + "'", str11, "\"'\\\"//\\\"'\"");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'#\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"\"//\"//\"//\"\"\\\\\"/#hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"hi!hi!#/\\\\\"\"#'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }
}

