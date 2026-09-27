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
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", ' ', "hi!", "hi!", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " hi! " + "'", str6, " hi! ");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.Class<?> wildcardClass6 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" hi! ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" hi! \"" + "'", str2, "\" hi! \"");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, (int) (byte) -1, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node6, (int) '#', context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\" hi! \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" hi! \"" + "'", str1, "\" hi! \"");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        java.lang.Class<?> wildcardClass6 = context4.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("hi!", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, (int) (byte) 1, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "\" hi! \"", "", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" hi! \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\" hi! \"/" + "'", str2, "/\" hi! \"/");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node6, (int) (byte) 1, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", '4', "aa", "aa", "aa", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4hi!4" + "'", str6, "4hi!4");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4hi!4", '4', "", "\" hi! \"", "\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44hi!44" + "'", str6, "44hi!44");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\\\\"\"'" + "'", str2, "'\"\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node19, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"hi!\"", 'a', "", "aa", "\" hi! \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ahi!a" + "'", str6, "ahi!a");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        java.lang.Class<?> wildcardClass10 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("44hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/44hi!44/" + "'", str1, "/44hi!44/");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, (int) (byte) -1, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("ahi!a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ahi!a/" + "'", str2, "/ahi!a/");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("44hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!44" + "'", str1, "44hi!44");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "/44hi!44/", "ahi!a", " hi! ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\"/" + "'", str2, "/\"\"/");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/hi!/" + "'", str1, "/hi!/");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\" hi! \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\" hi! \"/'" + "'", str2, "'/\" hi! \"/'");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/hi!/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\"", ' ', "aa", "\" hi! \"", "4hi!4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " aaaa " + "'", str6, " aaaa ");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" hi! \"" + "'", str1, "\" hi! \"");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (int) (short) 0, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\"", '#', "44", "44hi!44", "\"hi!\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#4444#" + "'", str6, "#4444#");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" aaaa ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ aaaa /" + "'", str1, "/ aaaa /");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = null;
        codeGenerator1.addList(node10, true, context12);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node3, 0);
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        int[] intArray34 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator26.addList(node27, intArray34);
        codeGenerator21.addList(node24, intArray34);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator21.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator42.addList(node43, false, context45);
        codeGenerator21.addList(node39, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\" hi! \"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\" hi! \"/'/" + "'", str1, "/'/\" hi! \"/'/");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str1, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'" + "'", str2, "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\"\"//");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        codeGenerator1.addList(node11, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("44");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node10, true, context12);
        java.lang.Class<?> wildcardClass14 = context12.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" aaaa ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" aaaa \"" + "'", str2, "\" aaaa \"");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", ' ', "/hi!/", " aaaa ", "/'/\" hi! \"/'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator28.addList(node33, false, context39);
        codeGenerator18.addList(node25, false, context39);
        codeGenerator1.addList(node15, false, context39);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("ahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ahi!a/" + "'", str1, "/ahi!a/");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        java.lang.Class<?> wildcardClass19 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/44hi!44/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/44hi!44/" + "'", str1, "/44hi!44/");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, (int) (byte) 10, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4hi!4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4hi!4\"" + "'", str2, "\"4hi!4\"");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("aa", ' ', "//\"\\\"\\\"\"//", "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'", "hi!", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " aa " + "'", str6, " aa ");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator23.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        codeGenerator23.addList(node28, false, context34);
        codeGenerator13.addList(node20, false, context34);
        codeGenerator1.addList(node10, false, context34);
        java.lang.Class<?> wildcardClass39 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" aaaa \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\" aaaa \"/" + "'", str2, "/\" aaaa \"/");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"\\\\\"\\\\\"\"'/" + "'", str1, "/'\"\\\\\"\\\\\"\"'/");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" hi! ", '#', "44", "#4444#", "'/\" hi! \"/'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "# hi! #" + "'", str6, "# hi! #");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node36, 10, context42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("44hi!44", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"44hi!44\"" + "'", str2, "\"44hi!44\"");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\" hi! \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\" hi! \"//" + "'", str2, "//\" hi! \"//");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        java.lang.Class<?> wildcardClass5 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, false, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4hi!4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//", 'a', "ahi!a", "//\" hi! \"//", " hi! ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//a" + "'", str6, "a//a");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"44hi!44\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"44hi!44\"/" + "'", str1, "/\"44hi!44\"/");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"44hi!44\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"44hi!44\"'" + "'", str2, "'\"44hi!44\"'");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" hi! \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" hi! \\\"\"" + "'", str1, "\"\\\" hi! \\\"\"");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"44hi!44\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"44hi!44\"//" + "'", str2, "//\"44hi!44\"//");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" aa ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ aa /" + "'", str2, "/ aa /");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node14, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\\\"\\\"\"///" + "'", str1, "///\"\\\"\\\"\"///");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "/44hi!44/", "", "\" aaaa \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        int[] intArray43 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator35.addList(node36, intArray43);
        codeGenerator23.addList(node33, intArray43);
        codeGenerator12.addList(node21, intArray43);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, false, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        codeGenerator50.addList(node55, false, context61);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator67.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator67.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator77.addList(node78, false, context80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer84 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator85 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator85.addList(node86, false, context88);
        codeGenerator77.addList(node82, false, context88);
        codeGenerator67.addList(node74, false, context88);
        codeGenerator50.addList(node64, false, context88);
        codeGenerator12.addList(node47, false, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/\" hi! \"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'/\" hi! \"/'//" + "'", str1, "//'/\" hi! \"/'//");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, false, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node25, false, context27);
        codeGenerator16.addList(node21, false, context27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node34, false, context36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator51.addList(node52, false, context54);
        codeGenerator43.addList(node48, false, context54);
        codeGenerator33.addList(node40, false, context54);
        codeGenerator16.addList(node30, false, context54);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4hi!4/" + "'", str1, "/4hi!4/");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node41, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/44hi!44/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/44hi!44/\"" + "'", str2, "\"/44hi!44/\"");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\" hi! \"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\" hi! \"/'/" + "'", str2, "/'/\" hi! \"/'/");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"hi!\"", 'a', "a//a", "\"/44hi!44/\"", "/ aaaa /", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa//ahi!a//aa" + "'", str6, "aa//ahi!a//aa");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator28.addList(node33, false, context39);
        codeGenerator18.addList(node25, false, context39);
        codeGenerator1.addList(node15, false, context39);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator47.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator47.addList(node53, true);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator59.addList(node60, false, context62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator59.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator69.addList(node70, false, context72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator77.addList(node78, false, context80);
        codeGenerator69.addList(node74, false, context80);
        codeGenerator59.addList(node66, false, context80);
        codeGenerator47.addList(node56, false, context80);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node44, (int) (byte) 100, context80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"\\\\\"\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str2, "'\\'\"\\\\\\\\\"\\\\\\\\\"\"\\''");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator48.addList(node53, intArray63);
        codeGenerator1.addList(node46, intArray63);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node67, 1, context69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#4444#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#4444#\"" + "'", str1, "\"#4444#\"");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" aa ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" aa \"" + "'", str2, "\" aa \"");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator28.addList(node33, false, context39);
        codeGenerator18.addList(node25, false, context39);
        codeGenerator1.addList(node15, false, context39);
        java.lang.Class<?> wildcardClass44 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\" aa \"", '#', "\"\\\"\\\\\\\"\\\\\\\"\\\"\"", "/ aaaa /", "/\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#" + "'", str6, "#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        int[] intArray17 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator1.addList(node11, intArray17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node19, (int) '#', context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator27.addList(node32, false, context34);
        codeGenerator19.addList(node24, false, context34);
        codeGenerator11.addList(node16, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node8, (int) (short) 1, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        int[] intArray27 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator19.addList(node20, intArray27);
        codeGenerator12.addList(node17, intArray27);
        codeGenerator1.addList(node10, intArray27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\" aaaa \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\" hi! \"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        int[] intArray40 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator32.addList(node33, intArray40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        int[] intArray52 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator44.addList(node45, intArray52);
        codeGenerator32.addList(node42, intArray52);
        codeGenerator21.addList(node30, intArray52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        int[] intArray66 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator58.addList(node59, intArray66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray74 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator58.addList(node68, intArray74);
        codeGenerator21.addList(node56, intArray74);
        codeGenerator1.addList(node19, intArray74);
        com.google.javascript.rhino.Node node78 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node78, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        codeGenerator1.addList(node11, intArray21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4hi!4", 'a', "aa", "/\"\"/", "\"#4444#\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a4hi!4a" + "'", str6, "a4hi!4a");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"hi!\"", '#', "\"#4444#\"", "//'/\" hi! \"/'//", "\"\\\"\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"#4444#\"hi!\"#4444#\"#" + "'", str6, "#\"#4444#\"hi!\"#4444#\"#");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"44hi!44\"'", ' ', "44hi!44", "//\" hi! \"//", "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// " + "'", str6, " //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// ");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "", "\"\\\"\\\\\\\"\\\\\\\"\\\"\"", "/\"\\\"\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("# hi! #", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/# hi! #/" + "'", str2, "/# hi! #/");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator48.addList(node53, intArray63);
        codeGenerator1.addList(node46, intArray63);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator78.addList(node79, false, context81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator86 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator86.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator86.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator86.addList(node91, false, context93);
        codeGenerator78.addList(node83, false, context93);
        codeGenerator70.addList(node75, true, context93);
        codeGenerator1.addList(node67, false, context93);
        java.lang.Class<?> wildcardClass98 = context93.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"44hi!44\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"44hi!44\"" + "'", str1, "\"44hi!44\"");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        int[] intArray25 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator17.addList(node18, intArray25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator17.addList(node29, false, context31);
        codeGenerator1.addList(node14, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node6, (int) (byte) 1, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\" hi! \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\" hi! \"//" + "'", str1, "//\" hi! \"//");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\\\"\\\"\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"\\\"\\\"\"///" + "'", str2, "///\"\\\"\\\"\"///");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("ahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!a" + "'", str1, "ahi!a");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator28.addList(node33, false, context39);
        codeGenerator18.addList(node25, false, context39);
        codeGenerator1.addList(node15, false, context39);
        java.lang.Class<?> wildcardClass44 = context39.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/44hi!44/\"", '4', "#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#", "\"#4444#\"", "//'/\" hi! \"/'//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4" + "'", str6, "4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator34.addList(node35, false, context37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator42.addList(node43, false, context45);
        codeGenerator34.addList(node39, false, context45);
        codeGenerator24.addList(node31, false, context45);
        codeGenerator12.addList(node21, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/hi!/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/hi!/\"/" + "'", str2, "/\"/hi!/\"/");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\" hi! \"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\" hi! \"//'" + "'", str2, "'//\" hi! \"//'");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) (short) 1, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.Class<?> wildcardClass4 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("hi!", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/hi!/" + "'", str2, "/hi!/");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\" hi! \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\" hi! \\\"\"/" + "'", str1, "/\"\\\" hi! \\\"\"/");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"\\\"\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\"\\\\\"\\\\\"\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'" + "'", str2, "'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node35, (int) '4', context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node40, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"/hi!/\"/", '4', "'/\" hi! \"/'", "\"\\\"/hi!/\\\"\"", "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4" + "'", str6, "4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node5, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"\\\"\\\"\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/# hi! #/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//# hi! #//" + "'", str2, "//# hi! #//");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"44hi!44\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"44hi!44\"'/" + "'", str1, "/'\"44hi!44\"'/");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\\'\"\\\\\\\\\"\\\\\\\\\"\"\\''", 'a', "/\"44hi!44\"/", "\"/44hi!44/\"", "/44hi!44/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a" + "'", str6, "a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator12.addList(node17, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, 1, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\" aaaa \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\" aaaa \"//" + "'", str1, "//\" aaaa \"//");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
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
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("ahi!a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("ahi!a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"ahi!a\"" + "'", str2, "\"ahi!a\"");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        int[] intArray40 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator32.addList(node33, intArray40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        int[] intArray52 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator44.addList(node45, intArray52);
        codeGenerator32.addList(node42, intArray52);
        codeGenerator21.addList(node30, intArray52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        int[] intArray66 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator58.addList(node59, intArray66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray74 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator58.addList(node68, intArray74);
        codeGenerator21.addList(node56, intArray74);
        codeGenerator1.addList(node19, intArray74);
        java.lang.Class<?> wildcardClass78 = intArray74.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/ aa /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ aa /" + "'", str1, "/ aa /");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator23.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        codeGenerator23.addList(node28, false, context34);
        codeGenerator13.addList(node20, false, context34);
        codeGenerator1.addList(node10, false, context34);
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4/" + "'", str1, "/4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4/");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("# hi! #");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" aaaa \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" aaaa \"'" + "'", str2, "'\" aaaa \"'");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ aaaa /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "// aaaa //" + "'", str2, "// aaaa //");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        codeGenerator7.addList(node10, intArray20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator7.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        codeGenerator7.addList(node25, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node38, false, context40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        codeGenerator37.addList(node42, false, context48);
        codeGenerator7.addList(node34, true, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node4, 1, context48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//# hi! #//", 'a', " aa ", "a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a", "/\" hi! \"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//# hi! #//a" + "'", str6, "a//# hi! #//a");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/hi!/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/hi!/\"//" + "'", str2, "//\"/hi!/\"//");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a4hi!4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator9.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator21.addList(node28, false, context42);
        codeGenerator9.addList(node18, false, context42);
        codeGenerator1.addList(node6, false, context42);
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'" + "'", str1, "'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("# hi! #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"# hi! #\"" + "'", str1, "\"# hi! #\"");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator9.addList(node14, false, context24);
        codeGenerator1.addList(node6, true, context24);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'", '#', "# hi! #", "/\"\"/", "/'\"\\\\\"\\\\\"\"'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/\"\"/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! ## hi! #/\"\"/#" + "'", str6, "#/\"\"/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! ## hi! #/\"\"/#");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\" hi! \\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\" hi! \\\\\"\"'" + "'", str2, "'\"\\\\\" hi! \\\\\"\"'");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/hi!/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/hi!/\"'" + "'", str2, "'\"/hi!/\"'");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '" + "'", str2, "' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node31, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"4hi!4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4hi!4\"" + "'", str1, "\"4hi!4\"");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator6.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator6.addList(node15, true, context17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        int[] intArray17 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator1.addList(node11, intArray17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a//# hi! #//a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a//# hi! #//a\"" + "'", str1, "\"a//# hi! #//a\"");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'\"\\\\\"\\\\\"\"'/", 'a', "//'/\" hi! \"/'//", "/# hi! #/", "//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a" + "'", str6, "a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node4, false, context6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\" hi! \\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, 1, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node48, false, context50);
        codeGenerator39.addList(node44, false, context50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator66.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node75, false, context77);
        codeGenerator66.addList(node71, false, context77);
        codeGenerator56.addList(node63, false, context77);
        codeGenerator39.addList(node53, false, context77);
        codeGenerator1.addList(node36, false, context77);
        com.google.javascript.rhino.Node node83 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node83, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node13, false, context15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a//a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\" aaaa \"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\" aaaa \"///" + "'", str1, "///\" aaaa \"///");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        int[] intArray40 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator32.addList(node33, intArray40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        int[] intArray52 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator44.addList(node45, intArray52);
        codeGenerator32.addList(node42, intArray52);
        codeGenerator21.addList(node30, intArray52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        int[] intArray66 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator58.addList(node59, intArray66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray74 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator58.addList(node68, intArray74);
        codeGenerator21.addList(node56, intArray74);
        codeGenerator1.addList(node19, intArray74);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator1.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node80, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4/" + "'", str1, "/4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4/");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/4hi!4/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/4hi!4/\"" + "'", str2, "\"/4hi!4/\"");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.Class<?> wildcardClass6 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        int[] intArray38 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator30.addList(node31, intArray38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        int[] intArray50 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator42.addList(node43, intArray50);
        codeGenerator30.addList(node40, intArray50);
        codeGenerator19.addList(node28, intArray50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator19.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator19.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator61.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator61.addList(node70, true, context72);
        codeGenerator19.addList(node58, false, context72);
        codeGenerator9.addList(node16, false, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        int[] intArray30 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator22.addList(node23, intArray30);
        codeGenerator17.addList(node20, intArray30);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node37, false, context39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator54.addList(node55, false, context57);
        codeGenerator46.addList(node51, false, context57);
        codeGenerator36.addList(node43, false, context57);
        codeGenerator17.addList(node33, false, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node14, (int) (short) 10, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("# hi! #");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("#/\"\"/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! #/'\"\\\\\"\\\\\"\"'//'\"\\\\\"\\\\\"\"'/# hi! ## hi! #/\"\"/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'" + "'", str2, "'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\" hi! \"/", ' ', "/ahi!a/", "4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4", "#\"#4444#\"hi!\"#4444#\"#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //ahi!a/ hi! /ahi!a// " + "'", str6, " //ahi!a/ hi! /ahi!a// ");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\\'\"\\\\\\\\\"\\\\\\\\\"\"\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"" + "'", str1, "\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"4hi!4\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"4hi!4\"'" + "'", str2, "'\"4hi!4\"'");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"" + "'", str1, "\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/" + "'", str2, "/4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/4hi!4/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//4hi!4//" + "'", str2, "//4hi!4//");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator10.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator10.addList(node19, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//4hi!4//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///4hi!4///" + "'", str2, "///4hi!4///");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/4hi!4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//4hi!4//" + "'", str1, "//4hi!4//");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        int[] intArray25 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator17.addList(node18, intArray25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator17.addList(node29, false, context31);
        codeGenerator1.addList(node14, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node34, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        codeGenerator1.addList(node11, intArray21);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node48, false, context50);
        codeGenerator39.addList(node44, false, context50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator66.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node75, false, context77);
        codeGenerator66.addList(node71, false, context77);
        codeGenerator56.addList(node63, false, context77);
        codeGenerator39.addList(node53, false, context77);
        codeGenerator1.addList(node36, false, context77);
        com.google.javascript.rhino.Node node83 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/aa/" + "'", str2, "/aa/");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/ aa /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator23.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        codeGenerator23.addList(node28, false, context34);
        codeGenerator13.addList(node20, false, context34);
        codeGenerator1.addList(node10, false, context34);
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node39, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        int[] intArray23 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator15.addList(node16, intArray23);
        codeGenerator10.addList(node13, intArray23);
        codeGenerator1.addList(node8, intArray23);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        int[] intArray43 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator35.addList(node36, intArray43);
        codeGenerator30.addList(node33, intArray43);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator30.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator51.addList(node52, false, context54);
        codeGenerator30.addList(node48, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator60.addList(node61, false, context63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator68.addList(node69, false, context71);
        codeGenerator60.addList(node65, false, context71);
        codeGenerator30.addList(node57, true, context71);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node27, (int) (byte) 10, context71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        codeGenerator48.addList(node51, intArray61);
        codeGenerator1.addList(node46, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/hi!/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/hi!/\"" + "'", str2, "\"/hi!/\"");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/ aaaa /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ aaaa /" + "'", str1, "/ aaaa /");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a//# hi! #//a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer3 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator4 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator4.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        int[] intArray17 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator9.addList(node10, intArray17);
        codeGenerator4.addList(node7, intArray17);
        codeGenerator1.addList(node2, intArray17);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        int[] intArray30 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator22.addList(node23, intArray30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        int[] intArray42 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator34.addList(node35, intArray42);
        codeGenerator22.addList(node32, intArray42);
        codeGenerator11.addList(node20, intArray42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator11.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator11.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator53.addList(node58, false, context60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator53.addList(node62, true, context64);
        codeGenerator11.addList(node50, false, context64);
        codeGenerator1.addList(node8, false, context64);
        java.lang.Class<?> wildcardClass68 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#\"#4444#\"hi!\"#4444#\"#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#\"#4444#\"hi!\"#4444#\"#" + "'", str1, "#\"#4444#\"hi!\"#4444#\"#");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a//a", '4', "/ahi!a/", "/\"\\\" hi! \\\"\"/", "aa//ahi!a//aa", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4a//a4" + "'", str6, "4a//a4");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"" + "'", str1, "\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node38, true, context40);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node38, true, context40);
        java.lang.Class<?> wildcardClass42 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/aa/" + "'", str1, "/aa/");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
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
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        java.lang.Class<?> wildcardClass30 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator28.addList(node33, false, context39);
        codeGenerator18.addList(node25, false, context39);
        codeGenerator1.addList(node15, false, context39);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\"\\\\\" hi! \\\\\"\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"44hi!44\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"44hi!44\"//" + "'", str1, "//\"44hi!44\"//");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("#\"#4444#\"hi!\"#4444#\"#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" //ahi!a/ hi! /ahi!a// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ //ahi!a/ hi! /ahi!a// /" + "'", str1, "/ //ahi!a/ hi! /ahi!a// /");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addAllSiblings(node46);
        java.lang.Class<?> wildcardClass48 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        int[] intArray40 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator32.addList(node33, intArray40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        int[] intArray52 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator44.addList(node45, intArray52);
        codeGenerator32.addList(node42, intArray52);
        codeGenerator21.addList(node30, intArray52);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        int[] intArray66 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator58.addList(node59, intArray66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray74 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator58.addList(node68, intArray74);
        codeGenerator21.addList(node56, intArray74);
        codeGenerator1.addList(node19, intArray74);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator1.addList(node78);
        java.lang.Class<?> wildcardClass80 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator29.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator29.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator29.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator45.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator45.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        int[] intArray69 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator61.addList(node62, intArray69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator61.addList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator61.addList(node73, false, context75);
        codeGenerator45.addList(node58, true, context75);
        codeGenerator29.addList(node42, false, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node26, (int) (short) -1, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        java.lang.Class<?> wildcardClass15 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\" hi! \"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\" hi! \\\"//\"" + "'", str1, "\"//\\\" hi! \\\"//\"");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/" + "'", str1, "/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"44hi!44\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"44hi!44\"///" + "'", str2, "///\"44hi!44\"///");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" hi! \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" hi! \"'" + "'", str2, "'\" hi! \"'");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        int[] intArray23 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator15.addList(node16, intArray23);
        codeGenerator10.addList(node13, intArray23);
        codeGenerator1.addList(node8, intArray23);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        int[] intArray42 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator34.addList(node35, intArray42);
        codeGenerator29.addList(node32, intArray42);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator29.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, false, context53);
        codeGenerator29.addList(node47, true, context53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node27, context53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator49.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator49.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator49.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator49.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        int[] intArray73 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator65.addList(node66, intArray73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator65.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator65.addList(node77, false, context79);
        codeGenerator49.addList(node62, true, context79);
        codeGenerator1.addList(node46, true, context79);
        java.lang.Class<?> wildcardClass83 = context79.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" aa ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" aa \"" + "'", str1, "\" aa \"");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4\"" + "'", str1, "\"4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4\"");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\" hi! \"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\" hi! \"/'" + "'", str1, "'/\" hi! \"/'");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node3, (int) '#', context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node9, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"\\\"\\\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"\\\"\\\"\"////" + "'", str1, "////\"\\\"\\\"\"////");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#\"#4444#\"hi!\"#4444#\"#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#\"#4444#\"hi!\"#4444#\"#/" + "'", str2, "/#\"#4444#\"hi!\"#4444#\"#/");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator9.addList(node14, false, context24);
        codeGenerator1.addList(node6, true, context24);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator1.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator35.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator35.addList(node43, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node33, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/44hi!44/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/44hi!44/\"" + "'", str1, "\"/44hi!44/\"");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        int[] intArray49 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator41.addList(node42, intArray49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        codeGenerator41.addList(node51, intArray61);
        codeGenerator30.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator30.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node67, true, context69);
        codeGenerator20.addList(node27, true, context69);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node17, 10, context69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        int[] intArray49 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator41.addList(node42, intArray49);
        codeGenerator36.addList(node39, intArray49);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator36.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator57.addList(node58, false, context60);
        codeGenerator36.addList(node54, true, context60);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node34, context60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        int[] intArray68 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator60.addList(node61, intArray68);
        codeGenerator48.addList(node58, intArray68);
        codeGenerator37.addList(node46, intArray68);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator37.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator37.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addList(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator79.addList(node82);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context86 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator79.addList(node84, false, context86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator79.addList(node88, true, context90);
        codeGenerator37.addList(node76, false, context90);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node35, context90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context86 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context86.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'/\" hi! \"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\" hi! \\\"/'/\"" + "'", str1, "\"/'/\\\" hi! \\\"/'/\"");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" aaaa ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " aaaa " + "'", str1, " aaaa ");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        codeGenerator1.addList(node10, intArray20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/" + "'", str2, "/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator48.addList(node53, intArray63);
        codeGenerator1.addList(node46, intArray63);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator78.addList(node79, false, context81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator86 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator86.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator86.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator86.addList(node91, false, context93);
        codeGenerator78.addList(node83, false, context93);
        codeGenerator70.addList(node75, true, context93);
        codeGenerator1.addList(node67, false, context93);
        com.google.javascript.rhino.Node node98 = null;
        codeGenerator1.addList(node98);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" aaaa ", '4', "\"\\\" hi! \\\"\"", "'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'", "# hi! #", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4 aaaa 4" + "'", str6, "4 aaaa 4");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        int[] intArray47 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator39.addList(node40, intArray47);
        codeGenerator34.addList(node37, intArray47);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator34.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node56, false, context58);
        codeGenerator34.addList(node52, true, context58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node31, (int) 'a', context58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        codeGenerator1.addList(node10, intArray20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\" hi! \\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("#4444#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"#4444#\"" + "'", str2, "\"#4444#\"");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4#\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\" aa \"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"#/44hi!44/#\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\" aa \"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"#4'" + "'", str2, "'4#\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\" aa \"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"#/44hi!44/#\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\" aa \"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"#4'");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node14, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (int) (short) -1, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\" hi! \\\"\"", ' ', "/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/", "\"\"", "\"\\\"\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ hi! \"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a//a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ " + "'", str6, " /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ hi! \"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a//a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ ");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"# hi! #\"", '#', "", "/#\"#4444#\"hi!\"#4444#\"#/", "# hi! #", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "## hi! ##" + "'", str6, "## hi! ##");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        codeGenerator30.addList(node35, false, context41);
        codeGenerator20.addList(node27, false, context41);
        codeGenerator1.addList(node17, false, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\" aaaa \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///4hi!4///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///4hi!4///\"" + "'", str1, "\"///4hi!4///\"");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator8.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator8.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        int[] intArray37 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator29.addList(node30, intArray37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        int[] intArray49 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator41.addList(node42, intArray49);
        codeGenerator29.addList(node39, intArray49);
        codeGenerator18.addList(node27, intArray49);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator18.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator18.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator60.addList(node65, false, context67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator60.addList(node69, true, context71);
        codeGenerator18.addList(node57, false, context71);
        codeGenerator8.addList(node15, false, context71);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, false, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        codeGenerator50.addList(node55, false, context61);
        codeGenerator40.addList(node47, false, context61);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node38, context61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"44\"" + "'", str1, "\"44\"");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator48.addList(node53, intArray63);
        codeGenerator1.addList(node46, intArray63);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator78.addList(node79, false, context81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator86 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator86.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator86.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator86.addList(node91, false, context93);
        codeGenerator78.addList(node83, false, context93);
        codeGenerator70.addList(node75, true, context93);
        codeGenerator1.addList(node67, false, context93);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"44hi!44\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"44hi!44\"/'" + "'", str2, "'/\"44hi!44\"/'");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"\\\\\"\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"\\\\\"\\\\\"\"'" + "'", str1, "'\"\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node16, false, context18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"\\\"\\\"\"/", ' ', "///\"44hi!44\"///", "\"44\"", "////\"\\\"\\\"\"////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ////\"44hi!44\"///////\"\\\"\\\"\"///////\"44hi!44\"///////\"\\\"\\\"\"///////\"44hi!44\"//////\"44hi!44\"//// " + "'", str6, " ////\"44hi!44\"///////\"\\\"\\\"\"///////\"44hi!44\"///////\"\\\"\\\"\"///////\"44hi!44\"//////\"44hi!44\"//// ");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#", 'a', "/\" aaaa \"/", "## hi! ##", " aaaa ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a" + "'", str6, "a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "4a//a4", "a4hi!4a", "aa//ahi!a//aa", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/4hi!4/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/4hi!4/\"/" + "'", str1, "/\"/4hi!4/\"/");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator1.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node30, true, context32);
        codeGenerator1.addList(node19, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node38, false, context40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        codeGenerator37.addList(node42, false, context48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node35, context48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\" hi! \"", ' ', "/4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/", "\"#4444#\"", "'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/ hi! /4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/ " + "'", str6, " /4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/ hi! /4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/ ");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/# hi! #/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/# hi! #/\"" + "'", str1, "\"/# hi! #/\"");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node30, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        java.lang.Class<?> wildcardClass10 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/ahi!a/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator9.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator21.addList(node28, false, context42);
        codeGenerator9.addList(node18, false, context42);
        codeGenerator1.addList(node6, false, context42);
        java.lang.Class<?> wildcardClass48 = context42.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'/" + "'", str1, "/'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'/");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"a//# hi! #//a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"a//# hi! #//a\"'" + "'", str2, "'\"a//# hi! #//a\"'");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/hi!/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/hi!/\"/" + "'", str1, "/\"/hi!/\"/");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/" + "'", str2, "/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        int[] intArray23 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator15.addList(node16, intArray23);
        codeGenerator10.addList(node13, intArray23);
        codeGenerator1.addList(node8, intArray23);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator30.addList(node33, false, context35);
        codeGenerator1.addList(node27, true, context35);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'#/\"\"/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! ## hi! #/\"\"/#\\''" + "'", str2, "'\\'#/\"\"/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! ## hi! #/\"\"/#\\''");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator24.addList(node32, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node22, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, false, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node37, false, context39);
        codeGenerator24.addList(node29, false, context39);
        codeGenerator16.addList(node21, true, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a4hi!4a", '#', "#\"#4444#\"hi!\"#4444#\"#", "///\" aaaa \"///", "/ aa /", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a4hi!4a#" + "'", str6, "#a4hi!4a#");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node20, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        int[] intArray17 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator1.addList(node11, intArray17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '//" + "'", str1, "//' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '//");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator49.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator49.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator49.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator49.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        int[] intArray73 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator65.addList(node66, intArray73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator65.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator65.addList(node77, false, context79);
        codeGenerator49.addList(node62, true, context79);
        codeGenerator1.addList(node46, true, context79);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer84 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator85 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator85.addList(node86, false, context88);
        com.google.javascript.rhino.Node node90 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer92 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator93 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer92);
        com.google.javascript.rhino.Node node94 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context96 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator93.addList(node94, false, context96);
        codeGenerator85.addList(node90, false, context96);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node83, context96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context96 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context96.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\" aaaa \"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\" aaaa \"////" + "'", str2, "////\" aaaa \"////");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///4hi!4///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////4hi!4////" + "'", str1, "////4hi!4////");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        int[] intArray37 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator29.addList(node30, intArray37);
        codeGenerator24.addList(node27, intArray37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator43.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator53.addList(node54, false, context56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator61.addList(node62, false, context64);
        codeGenerator53.addList(node58, false, context64);
        codeGenerator43.addList(node50, false, context64);
        codeGenerator24.addList(node40, false, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node21, (int) (byte) 10, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//\"44hi!44\"//", 'a', "\" aaaa \"", "a4hi!4a", "//\" hi! \"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//\" aaaa \"44hi!44\" aaaa \"//a" + "'", str6, "a//\" aaaa \"44hi!44\" aaaa \"//a");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"" + "'", str2, "\"\"");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"/hi!/\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"/hi!/\"'/" + "'", str2, "/'\"/hi!/\"'/");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        codeGenerator1.addList(node6, false, context12);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ hi! \"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a//a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ hi! \"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a//a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ /" + "'", str1, "/ /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ hi! \"\\\"\\\\\\\"\\\\\\\"\\\"\"/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a//a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ /");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node31, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node35, (int) (byte) -1, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator7.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        int[] intArray26 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator18.addList(node19, intArray26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        int[] intArray38 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator30.addList(node31, intArray38);
        codeGenerator18.addList(node28, intArray38);
        codeGenerator7.addList(node16, intArray38);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator53.addList(node54, false, context56);
        codeGenerator45.addList(node50, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node63, false, context65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator62.addAllSiblings(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator72.addList(node73, false, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator80.addList(node81, false, context83);
        codeGenerator72.addList(node77, false, context83);
        codeGenerator62.addList(node69, false, context83);
        codeGenerator45.addList(node59, false, context83);
        codeGenerator7.addList(node42, false, context83);
        codeGenerator1.addList(node4, true, context83);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator1.addList(node90, false);
        com.google.javascript.rhino.Node node93 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        int[] intArray42 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator34.addList(node35, intArray42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        int[] intArray54 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator46.addList(node47, intArray54);
        codeGenerator34.addList(node44, intArray54);
        codeGenerator23.addList(node32, intArray54);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator23.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node60, true, context62);
        codeGenerator13.addList(node20, true, context62);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'/" + "'", str1, "/'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'/");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        codeGenerator33.addList(node36, intArray46);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator33.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator54.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator54.addList(node62, true, context64);
        codeGenerator33.addList(node51, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node30, (int) (short) 0, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        int[] intArray51 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator43.addList(node44, intArray51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator43.addList(node53, intArray63);
        codeGenerator32.addList(node41, intArray63);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator32.addAllSiblings(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator32.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator74.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator74.addList(node79, false, context81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator74.addList(node83, true, context85);
        codeGenerator32.addList(node71, false, context85);
        codeGenerator22.addList(node29, false, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20, context85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4hi!4\"" + "'", str1, "\"4hi!4\"");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node48, false, context50);
        codeGenerator39.addList(node44, false, context50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator66.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node75, false, context77);
        codeGenerator66.addList(node71, false, context77);
        codeGenerator56.addList(node63, false, context77);
        codeGenerator39.addList(node53, false, context77);
        codeGenerator1.addList(node36, false, context77);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer84 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator85 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer84);
        com.google.javascript.rhino.Node node86 = null;
        int[] intArray93 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator85.addList(node86, intArray93);
        codeGenerator1.addList(node83, intArray93);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator1.addList(node96);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("///\" aaaa \"///", '4', "\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"", "'\"44hi!44\"'", "\"///4hi!4///\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4///\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\" aaaa \"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"///4" + "'", str6, "4///\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\" aaaa \"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"///4");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4 aaaa 4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4 aaaa 4\"" + "'", str2, "\"4 aaaa 4\"");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// /" + "'", str1, "/ //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// /");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"4hi!4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4hi!4\\\"\"" + "'", str1, "\"\\\"4hi!4\\\"\"");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a//# hi! #//a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a//# hi! #//a" + "'", str1, "a//# hi! #//a");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a4hi!4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a4hi!4a/" + "'", str1, "/a4hi!4a/");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" //ahi!a/ hi! /ahi!a// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" //ahi!a/ hi! /ahi!a// \"" + "'", str1, "\" //ahi!a/ hi! /ahi!a// \"");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"44hi!44\"/", ' ', "/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/", " aa ", "/# hi! #/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/44hi!44/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '// " + "'", str6, " //' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/44hi!44/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '// ");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"44hi!44\"'", '#', "a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a", " //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// ", "///4hi!4///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "# //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a44hi!44a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// #" + "'", str6, "# //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a44hi!44a#/\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/ aa /\" aaaa \"/ aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa  aaaa  aaaa /\" aaaa \"/ aaaa /\" aaaa \"//\" aaaa \"/#a //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// #");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator48.addList(node53, intArray63);
        codeGenerator1.addList(node46, intArray63);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator78.addList(node79, false, context81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator86 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator86.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator86.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator86.addList(node91, false, context93);
        codeGenerator78.addList(node83, false, context93);
        codeGenerator70.addList(node75, true, context93);
        codeGenerator1.addList(node67, false, context93);
        java.lang.Class<?> wildcardClass98 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node4, (int) (byte) 0);
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
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        int[] intArray27 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator19.addList(node20, intArray27);
        codeGenerator12.addList(node17, intArray27);
        codeGenerator1.addList(node10, intArray27);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node31, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"#4444#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"#4444#\"'" + "'", str2, "'\"#4444#\"'");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("44hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"44hi!44\"" + "'", str1, "\"44hi!44\"");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        int[] intArray17 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator1.addList(node11, intArray17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\"44hi!44\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\"44hi!44\"/'" + "'", str1, "'/\"44hi!44\"/'");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/a//# hi! #///'/\\\" hi! \\\"/'////////'/\\\" hi! \\\"/'////////'/\\\" hi! \\\"/'////'/\\\" hi! \\\"/'///# hi! #//a/\"" + "'", str1, "\"/a//# hi! #///'/\\\" hi! \\\"/'////////'/\\\" hi! \\\"/'////////'/\\\" hi! \\\"/'////'/\\\" hi! \\\"/'///# hi! #//a/\"");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  /" + "'", str1, "/  /");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        int[] intArray41 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator33.addList(node34, intArray41);
        codeGenerator26.addList(node31, intArray41);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node48, false, context50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator55.addList(node60, false, context62);
        codeGenerator47.addList(node52, false, context62);
        codeGenerator26.addList(node44, false, context62);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node23, (int) (byte) 0, context62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// /", '#', "\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"", "\"/'/\\\" hi! \\\"/'/\"", "\"'\\\"\\\\\\\\\\\"\\\\\\\\\\\"\\\"'\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/ //\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"//44hi!4444hi!4444hi!44//\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"// /#" + "'", str6, "#/ //\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"//44hi!4444hi!4444hi!44//\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"// /#");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        int[] intArray25 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator17.addList(node18, intArray25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator17.addList(node29, false, context31);
        codeGenerator1.addList(node14, true, context31);
        java.lang.Class<?> wildcardClass34 = context31.getClass();
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        int[] intArray23 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator15.addList(node16, intArray23);
        codeGenerator10.addList(node13, intArray23);
        codeGenerator1.addList(node8, intArray23);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator38.addList(node43, false, context45);
        codeGenerator30.addList(node35, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node27, (int) (byte) 100, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"44hi!44\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"44hi!44\\\"///\"" + "'", str1, "\"///\\\"44hi!44\\\"///\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/'/\" hi! \"/'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"4 aaaa 4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4 aaaa 4\\\"\"" + "'", str1, "\"\\\"4 aaaa 4\\\"\"");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        int[] intArray17 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator1.addList(node11, intArray17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator21.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator21.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator21.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        int[] intArray45 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator37.addList(node38, intArray45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator37.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator37.addList(node49, false, context51);
        codeGenerator21.addList(node34, true, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'//\" hi! \"//'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'//\" hi! \"//'/" + "'", str2, "/'//\" hi! \"//'/");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a//# hi! #//a", '#', "/\"/4hi!4/\"/", "/'\"44hi!44\"'/", "\"//\\\" hi! \\\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a//# hi! #//a#" + "'", str6, "#a//# hi! #//a#");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"4 aaaa 4\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"4 aaaa 4\\\"\"/" + "'", str2, "/\"\\\"4 aaaa 4\\\"\"/");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\\\\\" hi! \\\\\"\"'", ' ', " aaaa ", "/a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/", "/ aa /", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ aaaa / aa // aa / aaaa  hi! / aa // aa / aaaa  aaaa /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ " + "'", str6, " /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ aaaa / aa // aa / aaaa  hi! / aa // aa / aaaa  aaaa /a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a/ ");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        int[] intArray27 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator19.addList(node20, intArray27);
        codeGenerator12.addList(node17, intArray27);
        codeGenerator1.addList(node10, intArray27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator36.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        int[] intArray55 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator47.addList(node48, intArray55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        int[] intArray67 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator59.addList(node60, intArray67);
        codeGenerator47.addList(node57, intArray67);
        codeGenerator36.addList(node45, intArray67);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator36.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator36.addList(node73, true, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node33, (int) (byte) -1, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        codeGenerator46.addList(node51, intArray61);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator67.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator75.addList(node80, false, context82);
        codeGenerator67.addList(node72, false, context82);
        codeGenerator46.addList(node64, false, context82);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node44, context82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a'" + "'", str2, "'a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a'");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator5.addList(node8, false, context10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator15.addList(node24, true, context26);
        codeGenerator5.addList(node12, true, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node3, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        codeGenerator1.addList(node11, intArray21);
        java.lang.Class<?> wildcardClass24 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" /4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/ hi! /4#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#/44hi!44/#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#4/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" /4#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#/44hi!44/#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#4/ hi! /4#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#/44hi!44/#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#4/ \"" + "'", str1, "\" /4#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#/44hi!44/#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#4/ hi! /4#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#/44hi!44/#\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\" aa \\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"#4/ \"");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//# hi! #//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"/hi!/\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator38.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator38.addList(node50, false, context52);
        codeGenerator1.addList(node35, true, context52);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator1.addList(node55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/44hi!44/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"a//# hi! #//a\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"a//# hi! #//a\"'/" + "'", str2, "/'\"a//# hi! #//a\"'/");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4hi!4", ' ', "///4hi!4///", "/ //ahi!a/ hi! /ahi!a// /", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 4hi!4 " + "'", str6, " 4hi!4 ");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"# hi! #\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"# hi! #\"'" + "'", str2, "'\"# hi! #\"'");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4/'/\" hi! \"/'/hi!/'/\" hi! \"/'/4");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator30.addList(node35, false, context37);
        codeGenerator22.addList(node27, false, context37);
        codeGenerator1.addList(node19, false, context37);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node30, true, context32);
        codeGenerator1.addList(node19, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node47, false, context49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator54.addList(node59, false, context61);
        codeGenerator46.addList(node51, false, context61);
        codeGenerator38.addList(node43, true, context61);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator38.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addList(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator70.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator70.addList(node75, false, context77);
        codeGenerator38.addList(node67, false, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node35, (int) (short) 0, context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator9.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator21.addList(node28, false, context42);
        codeGenerator9.addList(node18, false, context42);
        codeGenerator1.addList(node6, false, context42);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        int[] intArray58 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator50.addList(node51, intArray58);
        codeGenerator1.addList(node48, intArray58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///4hi!4///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"# hi! #\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"# hi! #\\\"\"" + "'", str1, "\"\\\"# hi! #\\\"\"");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator25.addList(node30, false, context32);
        codeGenerator17.addList(node22, false, context32);
        codeGenerator1.addList(node14, false, context32);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"///4hi!4///\"", ' ', "////\"\\\"\\\"\"////", "#4444#", "/44hi!44/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// " + "'", str6, " ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// ");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator42.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        int[] intArray57 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator49.addList(node50, intArray57);
        codeGenerator42.addList(node47, intArray57);
        codeGenerator1.addList(node40, intArray57);
        com.google.javascript.rhino.Node node61 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator9.addList(node14, false, context24);
        codeGenerator1.addList(node6, true, context24);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator33.addList(node38, false, context40);
        codeGenerator1.addList(node30, false, context40);
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"" + "'", str2, "\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/hi!/\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"/hi!/\"///" + "'", str2, "///\"/hi!/\"///");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator9.addList(node14, false, context24);
        codeGenerator1.addList(node6, true, context24);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator1.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// /" + "'", str1, "/ ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// /");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        codeGenerator1.addList(node10, intArray20);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        int[] intArray43 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator35.addList(node36, intArray43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        int[] intArray55 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator47.addList(node48, intArray55);
        codeGenerator35.addList(node45, intArray55);
        codeGenerator25.addList(node33, intArray55);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator25.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator25.addList(node62, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node23, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/'/\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\'/'/\\\"\"" + "'", str1, "\"\\\"/'/\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\'/'/\\\"\"");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"44hi!44\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"44hi!44\"////" + "'", str2, "////\"44hi!44\"////");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '/", 'a', "/\"/hi!/\"/", "\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"", "'a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\" ///\"/hi!/\"/ hi! /\"/hi!/\"///44hi!4444hi!4444hi!44///\"/hi!/\"/ hi! /\"/hi!/\"/// \"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"/a" + "'", str6, "a/\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\" ///\"/hi!/\"/ hi! /\"/hi!/\"///44hi!4444hi!4444hi!44///\"/hi!/\"/ hi! /\"/hi!/\"/// \"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"/a");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        com.google.javascript.rhino.Node node48 = null;
        int[] intArray54 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator38.addList(node48, intArray54);
        codeGenerator1.addList(node36, intArray54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addList(node60, true);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator59.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator59.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator59.addList(node68, true, context70);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node57, context70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        int[] intArray23 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator15.addList(node16, intArray23);
        codeGenerator10.addList(node13, intArray23);
        codeGenerator1.addList(node8, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////4hi!4////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        codeGenerator48.addList(node51, intArray61);
        codeGenerator1.addList(node46, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator68.addList(node69, false, context71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator76.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator84 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator84.addList(node85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator84.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator84.addList(node89, false, context91);
        codeGenerator76.addList(node81, false, context91);
        codeGenerator68.addList(node73, true, context91);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node65, 1, context91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//4hi!4//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//4hi!4//\"" + "'", str1, "\"//4hi!4//\"");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4///\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\" aaaa \"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"///4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4///\"/4/\\'/\\\\\" hi! \\\\\"/\\'/hi!/\\'/\\\\\" hi! \\\\\"/\\'/4/\" aaaa \"/4/\\'/\\\\\" hi! \\\\\"/\\'/hi!/\\'/\\\\\" hi! \\\\\"/\\'/4/\"///4'" + "'", str2, "'4///\"/4/\\'/\\\\\" hi! \\\\\"/\\'/hi!/\\'/\\\\\" hi! \\\\\"/\\'/4/\" aaaa \"/4/\\'/\\\\\" hi! \\\\\"/\\'/hi!/\\'/\\\\\" hi! \\\\\"/\\'/4/\"///4'");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'//\" hi! \"//'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'//\\\" hi! \\\"//'/\"" + "'", str1, "\"/'//\\\" hi! \\\"//'/\"");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"/hi!/\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"/hi!/\\\"'\"" + "'", str1, "\"'\\\"/hi!/\\\"'\"");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        int[] intArray19 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator11.addList(node12, intArray19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator11.addList(node21, intArray31);
        codeGenerator1.addList(node9, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node44, (int) (byte) 1, context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        codeGenerator1.addList(node10, intArray20);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23, true);
        java.lang.Class<?> wildcardClass26 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        int[] intArray41 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator33.addList(node34, intArray41);
        codeGenerator28.addList(node31, intArray41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator28.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator49.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator49.addList(node57, true, context59);
        codeGenerator28.addList(node46, true, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"4hi!4\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"4hi!4\"'/" + "'", str2, "/'\"4hi!4\"'/");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\"a//# hi! #//a\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/'\\\"a//# hi! #//a\\\"'/\"" + "'", str2, "\"/'\\\"a//# hi! #//a\\\"'/\"");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"44hi!44\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"44hi!44\\\"\"" + "'", str1, "\"\\\"44hi!44\\\"\"");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        codeGenerator48.addList(node51, intArray61);
        codeGenerator1.addList(node46, intArray61);
        java.lang.Class<?> wildcardClass65 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator7.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        int[] intArray26 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator18.addList(node19, intArray26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        int[] intArray38 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator30.addList(node31, intArray38);
        codeGenerator18.addList(node28, intArray38);
        codeGenerator7.addList(node16, intArray38);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator53.addList(node54, false, context56);
        codeGenerator45.addList(node50, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node63, false, context65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator62.addAllSiblings(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator72.addList(node73, false, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator80.addList(node81, false, context83);
        codeGenerator72.addList(node77, false, context83);
        codeGenerator62.addList(node69, false, context83);
        codeGenerator45.addList(node59, false, context83);
        codeGenerator7.addList(node42, false, context83);
        codeGenerator1.addList(node4, true, context83);
        com.google.javascript.rhino.Node node90 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" hi! ", ' ', "//# hi! #//", "// aaaa //", "//\"/hi!/\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  hi!  " + "'", str6, "  hi!  ");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" aa ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"/hi!/\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"/hi!/\"'/" + "'", str1, "/'\"/hi!/\"'/");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator13.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator13.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator13.addList(node29, true, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/'/\\\" hi! \\\"/'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\'/\\\\\" hi! \\\\\"/\\'/\"'" + "'", str2, "'\"/\\'/\\\\\" hi! \\\\\"/\\'/\"'");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator1.addList(node6, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        codeGenerator1.addList(node11, intArray21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        int[] intArray39 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator31.addList(node32, intArray39);
        codeGenerator26.addList(node29, intArray39);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator26.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node48, false, context50);
        codeGenerator26.addList(node44, true, context50);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node24, context50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\" hi! \\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\\\\\" hi! \\\\\"\"'/" + "'", str2, "/'\"\\\\\" hi! \\\\\"\"'/");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a/" + "'", str1, "/a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a/");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ //ahi!a/ hi! /ahi!a// /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "// //ahi!a/ hi! /ahi!a// //" + "'", str1, "// //ahi!a/ hi! /ahi!a// //");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node4, false, context6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator10.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        int[] intArray25 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator17.addList(node18, intArray25);
        codeGenerator10.addList(node15, intArray25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        int[] intArray49 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator41.addList(node42, intArray49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        codeGenerator41.addList(node51, intArray61);
        codeGenerator30.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray75 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator67.addList(node68, intArray75);
        com.google.javascript.rhino.Node node77 = null;
        int[] intArray83 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator67.addList(node77, intArray83);
        codeGenerator30.addList(node65, intArray83);
        codeGenerator10.addList(node28, intArray83);
        codeGenerator1.addList(node8, intArray83);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator1.addList(node88, false);
        com.google.javascript.rhino.Node node91 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node91, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        int[] intArray41 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator33.addList(node34, intArray41);
        com.google.javascript.rhino.Node node43 = null;
        int[] intArray49 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator33.addList(node43, intArray49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator33.addList(node51, true);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator56.addList(node62, false);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray75 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator67.addList(node68, intArray75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78);
        com.google.javascript.rhino.Node node80 = null;
        int[] intArray87 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator79.addList(node80, intArray87);
        codeGenerator67.addList(node77, intArray87);
        codeGenerator56.addList(node65, intArray87);
        codeGenerator33.addList(node54, intArray87);
        codeGenerator1.addList(node31, intArray87);
        com.google.javascript.rhino.Node node93 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node93, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray87);
        org.junit.Assert.assertArrayEquals(intArray87, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        int[] intArray20 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator12.addList(node13, intArray20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator12.addList(node22, intArray32);
        codeGenerator1.addList(node10, intArray32);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node36, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        int[] intArray54 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator46.addList(node47, intArray54);
        codeGenerator41.addList(node44, intArray54);
        codeGenerator32.addList(node39, intArray54);
        codeGenerator1.addList(node30, intArray54);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node59, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator9.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator21.addList(node28, false, context42);
        codeGenerator9.addList(node18, false, context42);
        codeGenerator1.addList(node6, false, context42);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        int[] intArray58 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator50.addList(node51, intArray58);
        codeGenerator1.addList(node48, intArray58);
        com.google.javascript.rhino.Node node61 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"///4hi!4///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"///4hi!4///\\\"\"" + "'", str1, "\"\\\"///4hi!4///\\\"\"");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node14, true, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/hi!/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"/" + "'", str2, "/\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"/");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"#4444#\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"#4444#\\\"'\"" + "'", str1, "\"'\\\"#4444#\\\"'\"");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator8.addList(node9, intArray16);
        codeGenerator1.addList(node6, intArray16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node36, false, context38);
        codeGenerator27.addList(node32, false, context38);
        codeGenerator1.addList(node24, false, context38);
        java.lang.Class<?> wildcardClass42 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a\"/44hi!44/\"/44hi!44/\"/44hi!44/\"/\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//44hi!44//44hi!44//44hi!44//44hi!44//\"44hi!44\"//\"44hi!44\"//44hi!44/\"/44hi!44/\"\"/44hi!44/\"a", 'a', "a//a", "// //ahi!a/ hi! /ahi!a// //", "\"/# hi! #/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaa//a/44hi!44/a//a/44hi!44/a//a/44hi!44/a//a/a//a44hi!44a//a//44hi!44//44hi!44//44hi!44//44hi!44//a//a44hi!44a//a//44hi!44//44hi!44//44hi!44//44hi!44//a//a44hi!44a//a//a//a44hi!44a//a//44hi!44/a//a/44hi!44/a//aa//a/44hi!44/a//aaa" + "'", str6, "aaa//a/44hi!44/a//a/44hi!44/a//a/44hi!44/a//a/a//a44hi!44a//a//44hi!44//44hi!44//44hi!44//44hi!44//a//a44hi!44a//a//44hi!44//44hi!44//44hi!44//44hi!44//a//a44hi!44a//a//a//a44hi!44a//a//44hi!44/a//a/44hi!44/a//aa//a/44hi!44/a//aaa");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'\"4hi!4\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"4hi!4\\\"'/\"" + "'", str1, "\"/'\\\"4hi!4\\\"'/\"");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"44hi!44\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"44hi!44\"////" + "'", str1, "////\"44hi!44\"////");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        codeGenerator11.addList(node16, false, context22);
        codeGenerator1.addList(node8, false, context22);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node29, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        int[] intArray41 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator33.addList(node34, intArray41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator33.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator33.addList(node45, false, context47);
        codeGenerator17.addList(node30, true, context47);
        codeGenerator1.addList(node14, false, context47);
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node51, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/# hi! #/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/# hi! #/\\\"\"" + "'", str1, "\"\\\"/# hi! #/\\\"\"");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        int[] intArray14 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator6.addList(node7, intArray14);
        codeGenerator1.addList(node4, intArray14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator1.addList(node19, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node40, false, context42);
        codeGenerator31.addList(node36, false, context42);
        codeGenerator1.addList(node28, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator51.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator51.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator51.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator51.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator67.addList(node72, false, context74);
        codeGenerator51.addList(node64, true, context74);
        codeGenerator1.addList(node48, false, context74);
        java.lang.Class<?> wildcardClass78 = context74.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" aa \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\" aa \"/" + "'", str2, "/\" aa \"/");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'" + "'", str1, "'#/\"\"/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! #/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'//\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/# hi! ## hi! #/\"\"/#'");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a4hi!4a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a4hi!4a\"" + "'", str1, "\"a4hi!4a\"");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#\"\\\"\\\\\\\"\\\\\\\"\\\"\" aa \"\\\"\\\\\\\"\\\\\\\"\\\"\"#", 'a', "/ aaaa /", "\"/44hi!44/\"", "'\"4hi!4\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#/ aaaa /'\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"'/ aaaa // aaaa / aa / aaaa /'\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"'/ aaaa // aaaa /#a" + "'", str6, "a#/ aaaa /'\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"'/ aaaa // aaaa / aa / aaaa /'\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"''\"4hi!4\"''\"4hi!4\"'/ aaaa /'\"4hi!4\"'/ aaaa // aaaa /#a");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"44hi!44\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"44hi!44\"///" + "'", str1, "///\"44hi!44\"///");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer3 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator4 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator4.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator4.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator4.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        int[] intArray23 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator15.addList(node16, intArray23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        int[] intArray35 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator27.addList(node28, intArray35);
        codeGenerator15.addList(node25, intArray35);
        codeGenerator4.addList(node13, intArray35);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        int[] intArray49 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator41.addList(node42, intArray49);
        com.google.javascript.rhino.Node node51 = null;
        int[] intArray57 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator41.addList(node51, intArray57);
        codeGenerator4.addList(node39, intArray57);
        codeGenerator1.addList(node2, intArray57);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator64.addAllSiblings(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator64.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator64.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator64.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79);
        com.google.javascript.rhino.Node node81 = null;
        int[] intArray88 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator80.addList(node81, intArray88);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator80.addList(node90);
        com.google.javascript.rhino.Node node92 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context94 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator80.addList(node92, false, context94);
        codeGenerator64.addList(node77, true, context94);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node61, 1, context94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context94 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context94.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator9.addList(node14, false, context24);
        codeGenerator1.addList(node6, true, context24);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator33.addList(node38, false, context40);
        codeGenerator1.addList(node30, false, context40);
        java.lang.Class<?> wildcardClass43 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }
}

