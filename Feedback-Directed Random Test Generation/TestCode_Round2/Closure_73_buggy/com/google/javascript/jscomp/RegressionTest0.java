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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", ' ', "", "", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " hi! " + "'", str6, " hi! ");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"hi!\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", 'a', " hi! ", " hi! ", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ahi!a" + "'", str6, "ahi!a");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"hi!\"/" + "'", str1, "/\"hi!\"/");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"hi!\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"hi!\"/" + "'", str2, "/\"hi!\"/");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("ahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"ahi!a\"" + "'", str1, "\"ahi!a\"");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        java.lang.Class<?> wildcardClass2 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("hi!", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/hi!/" + "'", str2, "/hi!/");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node5, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/hi!/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" hi! \"" + "'", str1, "\" hi! \"");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
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
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        java.lang.Class<?> wildcardClass16 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//" + "'", str2, "//");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("ahi!a", '4', "\"ahi!a\"", "\" hi! \"", "\"hi!\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4ahi!a4" + "'", str6, "4ahi!a4");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4ahi!a4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4ahi!a4\"" + "'", str2, "\"4ahi!a4\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" hi! ");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, (int) (byte) 10, context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" hi! \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" hi! \"'" + "'", str2, "'\" hi! \"'");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4ahi!a4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4ahi!a4\"/" + "'", str1, "/\"4ahi!a4\"/");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"4ahi!a4\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"4ahi!a4\"/'" + "'", str2, "'/\"4ahi!a4\"/'");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str1, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\" hi! \"", ' ', "\"hi!\"", "\"4ahi!a4\"", "'\" hi! \"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " \"hi!\" hi! \"hi!\" " + "'", str6, " \"hi!\" hi! \"hi!\" ");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\"4ahi!a4\"/'", '#', "\"/hi!/\"", "", "//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/\"/hi!/\"4ahi!a4\"/hi!/\"/#" + "'", str6, "#/\"/hi!/\"4ahi!a4\"/hi!/\"/#");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator10.addList(node19, false, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"hi!\"/", ' ', "'\" hi! \"'", "\"ahi!a\"", "\" hi! \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /'\" hi! \"'hi!'\" hi! \"'/ " + "'", str6, " /'\" hi! \"'hi!'\" hi! \"'/ ");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/hi!/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/hi!/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        java.lang.Class<?> wildcardClass10 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("4ahi!a4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"4ahi!a4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4ahi!a4\"" + "'", str1, "\"4ahi!a4\"");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\" hi! \"'", '4', "\"4ahi!a4\"", "#/\"/hi!/\"4ahi!a4\"/hi!/\"/#", "\" hi! \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4" + "'", str6, "4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, 10, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node18, true, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
            codeGenerator2.add("\"/hi!/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"4ahi!a4\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"4ahi!a4\"/'/" + "'", str2, "/'/\"4ahi!a4\"/'/");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        codeGenerator2.addList(node9);
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) (short) 100, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/hi!/", '4', "4ahi!a4", "\"\\\"/hi!/\\\"\"", "/\"4ahi!a4\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/hi!/4" + "'", str6, "4/hi!/4");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#/\"/hi!/\"4ahi!a4\"/hi!/\"/#", ' ', "\" hi! \"", "\" hi! \"", "\" hi! \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " #/\" hi! \"/hi!/\" hi! \"4ahi!a4\" hi! \"/hi!/\" hi! \"/# " + "'", str6, " #/\" hi! \"/hi!/\" hi! \"4ahi!a4\" hi! \"/hi!/\" hi! \"/# ");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
            codeGenerator2.addExpr(node13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str1, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node19, false, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (short) 10, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"/hi!/\\\"\"", '#', "/\"hi!\"/", " #/\" hi! \"/hi!/\" hi! \"4ahi!a4\" hi! \"/hi!/\" hi! \"/# ", "hi!", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#" + "'", str6, "#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
            codeGenerator2.addExpr(node7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) (byte) -1, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        java.lang.Class<?> wildcardClass5 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"" + "'", str1, "\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'/\"4ahi!a4\"/'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"hi!\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
            codeGenerator2.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"ahi!a\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (-1), context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\" hi! \"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" /'\" hi! \"'hi!'\" hi! \"'/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " /'\" hi! \"'hi!'\" hi! \"'/ " + "'", str1, " /'\" hi! \"'hi!'\" hi! \"'/ ");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, (int) (short) 1, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"ahi!a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"ahi!a\"/" + "'", str2, "/\"ahi!a\"/");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/\"/hi!/\"4ahi!a4\"/hi!/\"/#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/" + "'", str1, "/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\" hi! \"", '#', "\" hi! \"", " \"hi!\" hi! \"hi!\" ", " \"hi!\" hi! \"hi!\" ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\" hi! \" hi! \" hi! \"#" + "'", str6, "#\" hi! \" hi! \" hi! \"#");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"ahi!a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"ahi!a\"'" + "'", str2, "'\"ahi!a\"'");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node20, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, 1, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"4ahi!a4\"/", ' ', "//", "#\" hi! \" hi! \" hi! \"#", "'\"ahi!a\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ///4ahi!a4/// " + "'", str6, " ///4ahi!a4/// ");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
            codeGenerator2.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4/hi!/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4/hi!/4\"" + "'", str1, "\"4/hi!/4\"");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"hi!\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"hi!\"/'" + "'", str2, "'/\"hi!\"/'");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/hi!/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//hi!//" + "'", str2, "//hi!//");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\"4ahi!a4\"/'", '4', "/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/", "/\"ahi!a\"/", " ///4ahi!a4/// ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4" + "'", str6, "4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node17, (int) (byte) -1, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4", '4', "", "\"\\\"/hi!/\\\"\"", "\" hi! \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44" + "'", str6, "44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//hi!//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///hi!///" + "'", str1, "///hi!///");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("#/\"/hi!/\"4ahi!a4\"/hi!/\"/#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        codeGenerator11.addArrayList(node12);
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
        codeGenerator11.addList(node14, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) (byte) 100, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'/\"4ahi!a4\"/'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/'/\\\"4ahi!a4\\\"/'/\"" + "'", str2, "\"/'/\\\"4ahi!a4\\\"/'/\"");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\" hi! \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\" hi! \"'/" + "'", str1, "/'\" hi! \"'/");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("#\" hi! \" hi! \" hi! \"#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#\" hi! \" hi! \" hi! \"#'" + "'", str2, "'#\" hi! \" hi! \" hi! \"#'");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
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
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"" + "'", str2, "\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("ahi!a", ' ', "'/\"hi!\"/'", "/\"ahi!a\"/", "hi!", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ahi!a " + "'", str6, " ahi!a ");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator26.addList(node34, false, context36);
        codeGenerator16.addList(node22, true, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, (int) (short) 100, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'#\" hi! \" hi! \" hi! \"#'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"4/hi!/4\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" ///4ahi!a4/// ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'/\"4ahi!a4\"/'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"" + "'", str1, "\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
            codeGenerator2.addLeftExpr(node5, (int) (short) 10, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"" + "'", str1, "\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" \"hi!\" hi! \"hi!\" ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ \"hi!\" hi! \"hi!\" /" + "'", str2, "/ \"hi!\" hi! \"hi!\" /");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4/hi!/4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4/hi!/4/" + "'", str2, "/4/hi!/4/");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
            codeGenerator1.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" \"hi!\" hi! \"hi!\" ", '4', "/'/\"4ahi!a4\"/'/", "4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4", " \"hi!\" hi! \"hi!\" ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4" + "'", str6, "4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"4ahi!a4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4ahi!a4\\\"\"" + "'", str1, "\"\\\"4ahi!a4\\\"\"");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" /'\" hi! \"'hi!'\" hi! \"'/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"" + "'", str1, "\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" hi! ", '4', "\"\\\"/hi!/\\\"\"", "4ahi!a4", "\"\\\"/hi!/\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4 hi! 4" + "'", str6, "4 hi! 4");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("ahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!a" + "'", str1, "ahi!a");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"ahi!a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//hi!//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"" + "'", str1, "\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (byte) 0, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/4/hi!/4/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"/" + "'", str1, "/\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"/");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'#\" hi! \" hi! \" hi! \"#'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'#\" hi! \" hi! \" hi! \"#'/" + "'", str1, "/'#\" hi! \" hi! \" hi! \"#'/");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"4/hi!/4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4/hi!/4\\\"\"" + "'", str1, "\"\\\"4/hi!/4\\\"\"");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"ahi!a\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        codeGenerator2.addList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\" hi! \"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(" ahi!a ");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'/\"hi!\"/'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
            codeGenerator2.add("//hi!//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
            codeGenerator2.addExpr(node7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.Class<?> wildcardClass24 = context21.getClass();
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        java.lang.Class<?> wildcardClass19 = context16.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass20 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4 hi! 4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4 hi! 4\"" + "'", str2, "\"4 hi! 4\"");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"" + "'", str2, "\"\"");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        com.google.javascript.jscomp.CodeGenerator.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4", ' ', "'/\"hi!\"/'", " \"hi!\" hi! \"hi!\" ", "44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 " + "'", str6, " 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        codeGenerator10.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator10.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator10.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        codeGenerator10.addList(node24, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"ahi!a\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"ahi!a\"/'" + "'", str2, "'/\"ahi!a\"/'");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'/\"ahi!a\"/'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"hi!\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"hi!\"/'/" + "'", str1, "/'/\"hi!\"/'/");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node21, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, (int) (byte) 1, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/ \"hi!\" hi! \"hi!\" /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"//" + "'", str1, "//\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"//");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", ' ', "\"4/hi!/4\"", "\"/'/\\\"4ahi!a4\\\"/'/\"", "/'/\"hi!\"/'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
            codeGenerator2.add(node31);
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///hi!///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///hi!///\"" + "'", str1, "\"///hi!///\"");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"ahi!a\"/", 'a', "\"hi!\"", "//hi!//", "4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/\"hi!\"ahi!a\"hi!\"/a" + "'", str6, "a/\"hi!\"ahi!a\"hi!\"/a");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator11.addList(node20, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node7, (int) ' ', context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" /'\" hi! \"'hi!'\" hi! \"'/ ", 'a', "", "'/\"ahi!a\"/'", "4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a" + "'", str6, "a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'/\\\"4ahi!a4\\\"/'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/'/\\\"4ahi!a4\\\"/'/\"/" + "'", str2, "/\"/'/\\\"4ahi!a4\\\"/'/\"/");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node29, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
            codeGenerator2.addExpr(node7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'/\"hi!\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'/\\\"hi!\\\"/'\"" + "'", str2, "\"'/\\\"hi!\\\"/'\"");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.Class<?> wildcardClass20 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4ahi!a4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4ahi!a4\"" + "'", str1, "\"4ahi!a4\"");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" ahi!a ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" ahi!a \"" + "'", str2, "\" ahi!a \"");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"ahi!a\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" hi! ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ hi! /" + "'", str2, "/ hi! /");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a", 'a', "", "/'/\"4ahi!a4\"/'/", "///hi!///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa //'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'// aa" + "'", str6, "aa //'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'// aa");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
            codeGenerator1.addCaseBody(node47);
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a" + "'", str1, "a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node26, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addAllSiblings(node18);
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
        codeGenerator14.addList(node20, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) '4', context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("4ahi!a4");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
            codeGenerator1.addExpr(node44, (int) '4');
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator47.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator47.addList(node55, false, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node44, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node22, false, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/'/\\\"4ahi!a4\\\"/'/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"4ahi!a4\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        java.lang.Class<?> wildcardClass4 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"///hi!///\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"///hi!///\"/" + "'", str2, "/\"///hi!///\"/");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\" hi! \"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) (byte) 100, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator13.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node32, true, context34);
        codeGenerator13.addList(node27, false, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node26, true, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (short) 0, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" \"hi!\" hi! \"hi!\" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
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
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, false);
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
        codeGenerator9.addList(node13, true, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"///hi!///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str1, "\"\\\"///hi!///\\\"\"");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"ahi!a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"ahi!a\"/" + "'", str1, "/\"ahi!a\"/");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a/\"hi!\"ahi!a\"hi!\"/a", 'a', "44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44", "  ", "/'\" hi! \"'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa" + "'", str6, "aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addAllSiblings(node17);
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
        codeGenerator13.addList(node19, true, context33);
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
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator40.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node51, false, context53);
        codeGenerator13.addList(node36, true, context53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'" + "'", str2, "'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        codeGenerator12.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator12.addList(node18, false, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, 1, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///hi!///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"///hi!///\"" + "'", str2, "\"///hi!///\"");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        codeGenerator2.addAllSiblings(node13);
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"hi!\"/" + "'", str1, "/\"hi!\"/");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" hi! \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\" hi! \"/" + "'", str1, "/\" hi! \"/");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (byte) 100, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"///hi!///\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"///hi!///\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"///hi!///\"'" + "'", str2, "'\"///hi!///\"'");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 " + "'", str1, " 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator41.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator41.addList(node47, false, context49);
        codeGenerator34.addList(node38, true, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node31, 100, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("hi!", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(" hi! ");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44", ' ', "/\"///hi!///\"/", "\"hi!\"", "/'/\"4ahi!a4\"/'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 " + "'", str6, " 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 ");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ \"hi!\" hi! \"hi!\" /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "// \"hi!\" hi! \"hi!\" //" + "'", str2, "// \"hi!\" hi! \"hi!\" //");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//", '4', "/'/\"4ahi!a4\"/'/", " /'\" hi! \"'hi!'\" hi! \"'/ ", " ahi!a ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4//4" + "'", str6, "4//4");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4/\\\\\\\"ahi!a\\\\\\\"///#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#/4ahi!a4/#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#///\\\\\\\"ahi!a\\\\\\\"/4\\\"\"" + "'", str1, "\"\\\"4/\\\\\\\"ahi!a\\\\\\\"///#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#/4ahi!a4/#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#///\\\\\\\"ahi!a\\\\\\\"/4\\\"\"");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("  ", ' ', "// \"hi!\" hi! \"hi!\" //", "'\"ahi!a\"'", " ///4ahi!a4/// ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "    " + "'", str6, "    ");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
            codeGenerator2.addExpr(node9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("4/hi!/4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator15.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node33, false, context35);
        codeGenerator15.addList(node21, true, context35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator42.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node53, false, context55);
        codeGenerator15.addList(node38, true, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, 1, context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node26, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"///hi!///\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"///hi!///\"'/" + "'", str2, "/'\"///hi!///\"'/");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"hi!\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" \"hi!\" hi! \"hi!\" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " \"hi!\" hi! \"hi!\" " + "'", str1, " \"hi!\" hi! \"hi!\" ");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4/hi!/4\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"4/hi!/4\"/" + "'", str2, "/\"4/hi!/4\"/");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("4//4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"hi!\\\"/\"" + "'", str1, "\"/\\\"hi!\\\"/\"");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"", '4', "/'#\" hi! \" hi! \" hi! \"#'/", "\"\\\"///hi!///\\\"\"", "/ \"hi!\" hi! \"hi!\" /", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4" + "'", str6, "4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\" hi! \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\" hi! \"/'" + "'", str2, "'/\" hi! \"/'");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/'/\\\"4ahi!a4\\\"/'/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\" hi! \"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
            codeGenerator2.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/hi!/", ' ', "4 hi! 4", "aa //'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'// aa", "//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /hi!/ " + "'", str6, " /hi!/ ");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 /" + "'", str2, "/ 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 /");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addAllSiblings(node18);
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
        codeGenerator14.addList(node20, true, context34);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node42, true, context44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator41.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node52, false, context54);
        codeGenerator14.addList(node37, true, context54);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, 10, context54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\" hi! \"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\" hi! \"'/" + "'", str2, "/'\" hi! \"'/");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"" + "'", str1, "\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator59.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator59.addList(node65, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node56, 0, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'/\"hi!\"/'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        java.lang.Class<?> wildcardClass10 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"" + "'", str2, "\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
            codeGenerator1.add("#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(" /'\" hi! \"'hi!'\" hi! \"'/ ");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'#\" hi! \" hi! \" hi! \"#'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'#\" hi! \" hi! \" hi! \"#'/" + "'", str1, "/'#\" hi! \" hi! \" hi! \"#'/");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/4/hi!/4/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/4/hi!/4/\"" + "'", str2, "\"/4/hi!/4/\"");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
            codeGenerator2.addExpr(node11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node21, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////" + "'", str1, "////");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ hi! /" + "'", str1, "/ hi! /");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\" hi! \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" hi! \"" + "'", str1, "\" hi! \"");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        java.nio.charset.Charset charset7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6, charset7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator8.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator8.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator8.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node29, false, context31);
        codeGenerator8.addList(node20, true, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node4, (int) (short) 10, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
            codeGenerator2.add("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/\"/hi!/\"4ahi!a4\"/hi!/\"/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/" + "'", str2, "/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
            codeGenerator2.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4//4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4//4\"" + "'", str2, "\"4//4\"");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node26, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"///hi!///\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"///hi!///\\\"\"/" + "'", str2, "/\"\\\"///hi!///\\\"\"/");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) (byte) 10, context72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" /'\" hi! \"'hi!'\" hi! \"'/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /'\" hi! \"'hi!'\" hi! \"'/ /" + "'", str1, "/ /'\" hi! \"'hi!'\" hi! \"'/ /");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(" 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ hi! /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ hi! /\"" + "'", str1, "\"/ hi! /\"");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'" + "'", str1, "'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node24, false, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, (int) (byte) 100, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/ 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 /");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4" + "'", str1, "4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4/" + "'", str2, "/4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4/");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node24, true, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node19, (int) (short) -1, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\" hi! \"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"" + "'", str1, "\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4/hi!/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4/hi!/4/" + "'", str1, "/4/hi!/4/");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a /'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'hi!'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'/ a\"" + "'", str1, "\"a /'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'hi!'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'/ a\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'#\" hi! \" hi! \" hi! \"#'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'#\" hi! \" hi! \" hi! \"#\\''" + "'", str2, "'\\'#\" hi! \" hi! \" hi! \"#\\''");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/" + "'", str2, "/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\" hi! \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\" hi! \\\"'\"" + "'", str1, "\"'\\\" hi! \\\"'\"");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("// \"hi!\" hi! \"hi!\" //");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/// \"hi!\" hi! \"hi!\" ///" + "'", str1, "/// \"hi!\" hi! \"hi!\" ///");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        java.lang.Class<?> wildcardClass14 = context12.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"4ahi!a4\\\"\"", 'a', "/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/", "\"\\\"\\\"\"", "'/\"ahi!a\"/'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a" + "'", str6, "a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/// \"hi!\" hi! \"hi!\" ///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'#\" hi! \" hi! \" hi! \"#'", ' ', "4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4", "", "aa //'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'// aa", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# " + "'", str6, " #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# ");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str1, "\"\\\"///hi!///\\\"\"");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"" + "'", str1, "\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44" + "'", str1, "44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node20, (int) (short) 1, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator25.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator25.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator25.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node37, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node22, (int) (short) 1, context39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        java.lang.Class<?> wildcardClass24 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///hi!///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////hi!////" + "'", str2, "////hi!////");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("ahi!a", 'a', "//", "\"/4/hi!/4/\"", "\"/'/\\\"4ahi!a4\\\"/'/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aahi!aa" + "'", str6, "aahi!aa");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.Class<?> wildcardClass46 = context42.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, 1);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node28, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\" hi! \\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\" hi! \\\"'\"/" + "'", str1, "/\"'\\\" hi! \\\"'\"/");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("aahi!aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        codeGenerator1.addList(node19, true);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'/\"4ahi!a4\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'/\\\"4ahi!a4\\\"/'\"" + "'", str2, "\"'/\\\"4ahi!a4\\\"/'\"");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"4 hi! 4\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) 'a', context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"'\\\" hi! \\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"'\\\\\\\" hi! \\\\\\\"'\\\"/\"" + "'", str1, "\"/\\\"'\\\\\\\" hi! \\\\\\\"'\\\"/\"");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
            codeGenerator2.addExpr(node95, 10);
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
            codeGenerator2.add("/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node63, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\\'#\" hi! \" hi! \" hi! \"#\\''", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\\'#\" hi! \" hi! \" hi! \"#\\''/" + "'", str2, "/'\\'#\" hi! \" hi! \" hi! \"#\\''/");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator20.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator35.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator45.addList(node53, false, context55);
        codeGenerator35.addList(node41, true, context55);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node63, true, context65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator62.addList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator62.addList(node73, false, context75);
        codeGenerator35.addList(node58, true, context75);
        codeGenerator20.addList(node32, true, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a/" + "'", str1, "/a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a/");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"hi!\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        java.lang.Class<?> wildcardClass17 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4 hi! 4");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4", ' ', " ahi!a ", "/\"hi!\"/", "// \"hi!\" hi! \"hi!\" //", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 " + "'", str6, " 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"hi!\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/hi!/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/hi!/\"'" + "'", str2, "'\"/hi!/\"'");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\\'#\" hi! \" hi! \" hi! \"#\\''", '#', "/\"'\\\" hi! \\\"'\"/", "\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"", " /hi!/ ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\" /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#/\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/# /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#" + "'", str6, "#\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\" /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#/\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/# /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node63);
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/" + "'", str2, "/\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"/#/\\\\\"/hi!/\\\\\"4ahi!a4\\\\\"/hi!/\\\\\"/#/\"/'" + "'", str2, "'/\"/#/\\\\\"/hi!/\\\\\"4ahi!a4\\\\\"/hi!/\\\\\"/#/\"/'");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"4ahi!a4\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"4ahi!a4\"/'/" + "'", str1, "/'/\"4ahi!a4\"/'/");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\" hi! \"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/'\\\" hi! \\\"'/\"" + "'", str2, "\"/'\\\" hi! \\\"'/\"");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/'\" hi! \"'/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        com.google.javascript.jscomp.CodeGenerator.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, (int) (short) -1, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#", '#', "/\"hi!\"/", "/\"///hi!///\"/", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##" + "'", str6, "##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("aa //'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'//ahi!a//'/\"4ahi!a4\"/'// aa");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node19, false, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) 'a', context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa", '4', " /hi!/ ", "\"\\\"/hi!/\\\"\"", "  ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4" + "'", str6, "4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"4ahi!a4\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"4ahi!a4\\\"\"/" + "'", str1, "/\"\\\"4ahi!a4\\\"\"/");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass63 = context58.getClass();
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("////hi!////", 'a', "##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##", " 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 ", "/\"'\\\" hi! \\\"'\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a////hi!////a" + "'", str6, "a////hi!////a");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a////hi!////a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a////hi!////a\"" + "'", str1, "\"a////hi!////a\"");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"", 'a', "// \"hi!\" hi! \"hi!\" //", "\"'\\\" hi! \\\"'\"", "'#\" hi! \" hi! \" hi! \"#'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a" + "'", str6, "a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4 /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ hi! /'/\"4ahi!a4\"/'/hi!/'/\"4ahi!a4\"/'/ 4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"" + "'", str2, "\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/" + "'", str2, "/\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'/" + "'", str2, "/'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'/");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/ hi! /\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\" ahi!a \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" ahi!a \"" + "'", str1, "\" ahi!a \"");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'" + "'", str2, "'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("a/\"hi!\"ahi!a\"hi!\"/a");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        codeGenerator2.addArrayList(node12);
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"///hi!///\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"///hi!///\"'/" + "'", str1, "/'\"///hi!///\"'/");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
            codeGenerator2.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"" + "'", str1, "\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        codeGenerator2.addAllSiblings(node13);
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 /" + "'", str2, "/ 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 /");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"4//4\"", ' ', "\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"", " 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ", "/ /'\" hi! \"'hi!'\" hi! \"'/ /", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" " + "'", str6, " \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" ");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/'/\"hi!\"/'/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator10.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node34, false, context36);
        codeGenerator10.addList(node25, true, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/'/\\\"4ahi!a4\\\"/'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\"4ahi!a4\\\"/'/\"" + "'", str1, "\"/'/\\\"4ahi!a4\\\"/'/\"");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/ 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 /");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4//4");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, (int) 'a', context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"" + "'", str1, "\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a/\"hi!\"ahi!a\"hi!\"/a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ", 'a', "  ", "\"'/\\\"4ahi!a4\\\"/'\"", "/\"4/hi!/4\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a" + "'", str6, "a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/ hi! /");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(" /hi!/ ");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        java.lang.Class<?> wildcardClass31 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" ahi!a \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\" ahi!a \"/" + "'", str2, "/\" ahi!a \"/");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("a////hi!////a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node31, false, context33);
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
        codeGenerator20.addList(node35, true, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node16, (int) (byte) 100, context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        codeGenerator2.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
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
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator12.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator12.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator32.addList(node41, false, context43);
        codeGenerator12.addList(node28, false, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node8, (int) 'a', context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node26, true, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, 10, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" #/\" hi! \"/hi!/\" hi! \"4ahi!a4\" hi! \"/hi!/\" hi! \"/# ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ #/\" hi! \"/hi!/\" hi! \"4ahi!a4\" hi! \"/hi!/\" hi! \"/# /" + "'", str1, "/ #/\" hi! \"/hi!/\" hi! \"4ahi!a4\" hi! \"/hi!/\" hi! \"/# /");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa/" + "'", str2, "/aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa/");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node41, true, context43);
        codeGenerator27.addList(node36, false, context43);
        codeGenerator17.addList(node23, true, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node14, (int) (short) 100, context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\\'#\" hi! \" hi! \" hi! \"#\\''/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'\\'#\" hi! \" hi! \" hi! \"#\\''//" + "'", str1, "//'\\'#\" hi! \" hi! \" hi! \"#\\''//");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4/" + "'", str2, "/4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4/");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("    ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/    /" + "'", str2, "/    /");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        java.lang.Class<?> wildcardClass16 = context14.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

