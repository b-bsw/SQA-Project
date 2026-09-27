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
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "hi!", "", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
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
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("44", ' ', "hi!", "", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 44 " + "'", str6, " 44 ");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" 44 ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ 44 /" + "'", str2, "/ 44 /");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node2, (int) (byte) 10, context4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ 44 /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ 44 /\"" + "'", str1, "\"/ 44 /\"");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context3 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node2, context3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context3 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context3.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/ 44 /\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/ 44 /\"/" + "'", str2, "/\"/ 44 /\"/");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node4, 0, context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray7 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap8 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes9 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray7, variableMap8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes9.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '#', 'a', '#', '4' });
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context3 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node2, context3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context3 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context3.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/ 44 /\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node5, (int) '#', context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/ 44 /\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/ 44 /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ 44 /\"" + "'", str1, "\"/ 44 /\"");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, (int) ' ', context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) (short) 1, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/ 44 /\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/ 44 /\"//" + "'", str1, "//\"/ 44 /\"//");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" 44 ");
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
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/ 44 /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "44", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" 44 ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" 44 \"" + "'", str2, "\" 44 \"");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/ 44 /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/ 44 /\"" + "'", str2, "\"/ 44 /\"");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" 44 \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" 44 \"'" + "'", str2, "'\" 44 \"'");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/ 44 /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/ 44 /\\\"\"" + "'", str1, "\"\\\"/ 44 /\\\"\"");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context3 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node2, context3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context3 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context3.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/ 44 /\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/ 44 /\\\"\"/" + "'", str1, "/\"\\\"/ 44 /\\\"\"/");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\" 44 \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"hi!\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str2, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\" 44 \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\" 44 \"'" + "'", str1, "'\" 44 \"'");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", ' ', "/\"\\\"/ 44 /\\\"\"/", "\"hi!\"", "\" 44 \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/ 44 /\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/ 44 /\\\"/\"" + "'", str1, "\"/\\\"/ 44 /\\\"/\"");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ 44 /", 'a', "\"hi!\"", "\"hi!\"", "hi!", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/ 44 /a" + "'", str6, "a/ 44 /a");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node4, true, context6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, " 44 ", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\" 44 \"", ' ', "\"/\\\"/ 44 /\\\"/\"", "/\"/ 44 /\"/", "\" 44 \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" " + "'", str6, " \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) (short) -1, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"hi!\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"hi!\"'" + "'", str2, "'\"hi!\"'");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray8 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap9);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/ 44 /\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/ 44 /\"/" + "'", str1, "/\"/ 44 /\"/");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  " + "'", str1, "  ");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
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
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"hi!\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"hi!\\\"\"//" + "'", str2, "//\"\\\"hi!\\\"\"//");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.Class<?> wildcardClass3 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"" + "'", str1, "\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray8 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap9);
        com.google.javascript.jscomp.VariableMap variableMap11 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap12 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = renamePrototypes10.getPropertyMap();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes10.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap11);
        org.junit.Assert.assertNotNull(variableMap12);
        org.junit.Assert.assertNotNull(variableMap13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/ 44 /\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/ 44 /\\\"/\"/" + "'", str1, "/\"/\\\"/ 44 /\\\"/\"/");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"" + "'", str1, "\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/ 44 /\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"/ 44 /\"///" + "'", str1, "///\"/ 44 /\"///");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        java.lang.Class<?> wildcardClass25 = renamePrototypes24.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"" + "'", str2, "\"\"");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" 44 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 44 " + "'", str1, " 44 ");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" " + "'", str1, " \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"/\\\"/ 44 /\\\"/\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"hi!\"", ' ', "/\"\\\"/ 44 /\\\"\"/", "\"/ 44 /\"", "/\"/ 44 /\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ " + "'", str6, " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
            codeGenerator1.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator7.addList(node10, true, context12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node5, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node6, (int) (byte) 0, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'" + "'", str2, "'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
            codeGenerator1.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/hi!/" + "'", str1, "/hi!/");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"hi!\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\"hi!\\\"'\"" + "'", str2, "\"'\\\"hi!\\\"'\"");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a/ 44 /a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a/ 44 /a" + "'", str1, "a/ 44 /a");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '" + "'", str2, "' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node12, false, context14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node16, false, context18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node17, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes18.process(node19, node20);
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
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "hi!", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" 44 \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" 44 \\\"\"" + "'", str1, "\"\\\" 44 \\\"\"");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"hi!\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"hi!\\\\\"\"'" + "'", str2, "'\"\\\\\"hi!\\\\\"\"'");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        java.lang.Class<?> wildcardClass11 = context9.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/ 44 /\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"'\\\"hi!\\\"'\"", '#', "'\"\\\\\"hi!\\\\\"\"'", "\"'\\\"hi!\\\"'\"", "\" 44 \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"\" 44 \"'\"\\\\\"hi!\\\\\"\"'hi!\" 44 \"'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"'\"\\\\\"hi!\\\\\"\"'#" + "'", str6, "#'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"\" 44 \"'\"\\\\\"hi!\\\\\"\"'hi!\" 44 \"'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"'\"\\\\\"hi!\\\\\"\"'#");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        java.lang.Class<?> wildcardClass11 = context9.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("44", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/44/" + "'", str2, "/44/");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.Class<?> wildcardClass6 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"hi!\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"hi!\"'/" + "'", str1, "/'\"hi!\"'/");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", 'a', "\"/\\\"/ 44 /\\\"/\"", "/'\"hi!\"'/", "\"hi!\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a" + "'", str6, "a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/" + "'", str2, "/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\\\\\"hi!\\\\\"\"'", 'a', "a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a", "\"\\\" 44 \\\"\"", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a" + "'", str6, "a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//" + "'", str2, "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\"hi!\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'\"hi!\"'//" + "'", str1, "//'\"hi!\"'//");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node12, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\"'" + "'", str2, "'\"\"'");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//" + "'", str1, "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
            codeGenerator1.add("a/ 44 /a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node14, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, 10, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"/ 44 /\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"/ 44 /\"/'" + "'", str2, "'/\"/ 44 /\"/'");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node3, (int) (short) -1, context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes24.process(node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap23);
        org.junit.Assert.assertNotNull(variableMap25);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node4, (int) (short) 0, context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes28.process(node29, node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap24);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(variableMap27);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/ 44 /\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'\" 44 \"'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (short) 100);
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        java.lang.Class<?> wildcardClass6 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /" + "'", str2, "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" 44 \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\" 44 \"/" + "'", str1, "/\" 44 \"/");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"\\\\\"hi!\\\\\"\"'/" + "'", str1, "/'\"\\\\\"hi!\\\\\"\"'/");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node4, true, context6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (int) '#', context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//'\"hi!\"'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///'\"hi!\"'///" + "'", str1, "///'\"hi!\"'///");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\"hi!\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/'\\\"hi!\\\"'/\"" + "'", str2, "\"/'\\\"hi!\\\"'/\"");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'\\\"hi!\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"" + "'", str1, "\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node14, 0, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node16, true, context18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"\\\" 44 \\\"\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray8 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap9);
        com.google.javascript.jscomp.VariableMap variableMap11 = renamePrototypes10.getPropertyMap();
        java.lang.Class<?> wildcardClass12 = renamePrototypes10.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap11);
        org.junit.Assert.assertNotNull(wildcardClass12);
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node12, false, context14);
        codeGenerator1.addList(node5, true, context14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/'\"hi!\"'/", config2, errorReporter3);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/ 44 /\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("#'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"\" 44 \"'\"\\\\\"hi!\\\\\"\"'hi!\" 44 \"'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"'\"\\\\\"hi!\\\\\"\"'#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"" + "'", str1, "\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/\"/ 44 /\"/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//'\"hi!\"'//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///'\"hi!\"'///" + "'", str2, "///'\"hi!\"'///");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass24 = context21.getClass();
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"" + "'", str1, "\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator6.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator6.addList(node12, true);
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
        codeGenerator6.addList(node15, false, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
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
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
        java.lang.Class<?> wildcardClass24 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\" 44 \"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\" 44 \"'/" + "'", str2, "/'\" 44 \"'/");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
        codeGenerator21.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node32, false, context34);
        codeGenerator21.addList(node25, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node18, 10, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node9, (int) (short) 0);
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
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = null;
        codeGenerator1.addList(node7, true, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node34, true, context36);
        codeGenerator22.addList(node23, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node19, (int) (byte) -1, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"" + "'", str1, "\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
            codeGenerator1.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes41.process(node43, node44);
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
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/" + "'", str1, "/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node13, true, context15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8, context15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.Class<?> wildcardClass29 = variableMap27.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap24);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/" + "'", str1, "/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"\\\"hi!\\\"\"/", '#', "\"hi!\"", "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /", "a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#" + "'", str6, "#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray2 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        char[] charArray11 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler3, true, charArray11, variableMap12);
        com.google.javascript.jscomp.VariableMap variableMap14 = renamePrototypes13.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes13.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes16 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray2, variableMap15);
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes16.getPropertyMap();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes16.process(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap14);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap17);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        java.lang.Class<?> wildcardClass13 = context11.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node17, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"/ 44 /\\\"/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/\\\"/ 44 /\\\"/\"//" + "'", str2, "//\"/\\\"/ 44 /\\\"/\"//");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  /" + "'", str1, "/  /");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node6, false, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"/ 44 /\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.Class<?> wildcardClass20 = renamePrototypes18.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.lang.Class<?> wildcardClass42 = renamePrototypes41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Class<?> wildcardClass17 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'\" 44 \"'/", ' ', "'\"\"'", "/44/", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //44/'\"\"' 44 '\"\"'/44// " + "'", str6, " //44/'\"\"' 44 '\"\"'/44// ");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\"\\\"'\"" + "'", str2, "\"'\\\"\\\"'\"");
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
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "a/ 44 /a", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#" + "'", str1, "#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/'\\\"hi!\\\"'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"hi!\\\"'/\"" + "'", str1, "\"/'\\\"hi!\\\"'/\"");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/ 44 /\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/ 44 /\"//" + "'", str1, "//\"/ 44 /\"//");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\\\"hi!\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
            codeGenerator1.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"/\\\"/ 44 /\\\"/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
            codeGenerator1.add("\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"/\\\"/ 44 /\\\"/\"/", ' ', "  ", "\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /  /  / 44 /  /  / " + "'", str6, " /  /  / 44 /  /  / ");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node3, context15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/ 44 /");
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
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" //44/'\"\"' 44 '\"\"'/44// ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        com.google.javascript.jscomp.VariableMap variableMap44 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes45 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray13, variableMap44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes45.process(node46, node47);
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
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes73.process(node74, node75);
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
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap71);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        char[] charArray23 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        char[] charArray32 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap33 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes34 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler24, true, charArray32, variableMap33);
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes34.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap36 = renamePrototypes34.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, false, charArray23, variableMap36);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray5, variableMap36);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes38.process(node39, node40);
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
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertArrayEquals(charArray23, new char[] {});
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap35);
        org.junit.Assert.assertNotNull(variableMap36);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray38 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes40 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, false, charArray38, variableMap39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray49 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap50 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes51 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray49, variableMap50);
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray38, variableMap52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        char[] charArray62 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap63 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler54, true, charArray62, variableMap63);
        com.google.javascript.jscomp.VariableMap variableMap65 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap66 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap67 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, false, charArray38, variableMap67);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes69 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray11, variableMap67);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.rhino.Node node71 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes69.process(node70, node71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap65);
        org.junit.Assert.assertNotNull(variableMap66);
        org.junit.Assert.assertNotNull(variableMap67);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        codeGenerator13.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator13.addList(node21, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, 100, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
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
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"/\\\"/ 44 /\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"" + "'", str1, "\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"");
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
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator24.addList(node32, false, context34);
        codeGenerator14.addList(node21, false, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (-1), context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        com.google.javascript.jscomp.CodeGenerator.Context context26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node24, (int) '#', context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/ 44 /\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/ 44 /\"//" + "'", str2, "//\"/ 44 /\"//");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/" + "'", str1, "/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\"/ 44 /\"/'", '4', "/\"\\\"/ 44 /\\\"\"/", "/'\"hi!\"'/", "\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4" + "'", str6, "4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"\\\\\"hi!\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator6.addList(node9, true, context11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node3, (int) (byte) 0, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//\"/ 44 /\"//", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\"\\\\\"hi!\\\\\"\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\'/'" + "'", str2, "'/\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\'/'");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray8 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap9);
        com.google.javascript.jscomp.VariableMap variableMap11 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap12 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap14 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes10.getPropertyMap();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes10.process(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap11);
        org.junit.Assert.assertNotNull(variableMap12);
        org.junit.Assert.assertNotNull(variableMap13);
        org.junit.Assert.assertNotNull(variableMap14);
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node4, true, context6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes34.getPropertyMap();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes34.process(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(variableMap35);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"" + "'", str1, "\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'" + "'", str2, "'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/" + "'", str2, "/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"\"'", 'a', "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//", "\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"", "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"a" + "'", str6, "a\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"a");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator28.addList(node33, false, context35);
        codeGenerator13.addList(node25, true, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/a /\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ a/\\\"\"" + "'", str1, "\"\\\"/a /\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ a/\\\"\"");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///\"/ 44 /\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'///\"/ 44 /\"///'" + "'", str2, "'///\"/ 44 /\"///'");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" //44/'\"\"' 44 '\"\"'/44// ", ' ', "\"'\\\"hi!\\\"'\"", " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", "  ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  " + "'", str6, "  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  ");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'///\"/ 44 /\"///'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'///\"/ 44 /\"///'" + "'", str1, "'///\"/ 44 /\"///'");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\" 44 \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\" 44 \"/" + "'", str1, "/\" 44 \"/");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"" + "'", str1, "\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray4, variableMap32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator15.addList(node20, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator15.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node33, false, context35);
        codeGenerator15.addList(node22, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node12, (int) (byte) 1, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"/ 44 /\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"/ 44 /\"/'/" + "'", str1, "/'/\"/ 44 /\"/'/");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, 0, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\"\\\\\\\"'\\\"\"" + "'", str1, "\"\\\"'\\\\\\\"\\\\\\\"'\\\"\"");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/" + "'", str1, "/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
        java.lang.Class<?> wildcardClass74 = renamePrototypes73.getClass();
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, " \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\"" + "'", str1, "\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\"");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"/ 44 /\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"/ 44 /\\\"/\"//" + "'", str1, "//\"/\\\"/ 44 /\\\"/\"//");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = null;
        codeGenerator1.addList(node7, true, context9);
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a/" + "'", str2, "/a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a/");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.Class<?> wildcardClass45 = charArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, (int) (byte) -1, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\" 44 \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"/ 44 /\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"/ 44 /\"////" + "'", str1, "////\"/ 44 /\"////");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node42, context66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"\\\"'\"" + "'", str1, "\"'\\\"\\\"'\"");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\" 44 \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" 44 \"" + "'", str1, "\" 44 \"");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////\"/ 44 /\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node42, context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/\\\"/ 44 /\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"" + "'", str1, "\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
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
            codeGenerator1.addLeftExpr(node10, (int) (byte) 1, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator15.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, true);
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
        codeGenerator15.addList(node24, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node12, 10, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
            codeGenerator1.add("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/44/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//44//" + "'", str1, "//44//");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'" + "'", str2, "'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node40, true, context42);
        codeGenerator20.addList(node34, false, context42);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator48.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator65.addAllSiblings(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator65.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator65.addList(node73, true, context75);
        codeGenerator61.addList(node62, false, context75);
        codeGenerator48.addList(node57, true, context75);
        codeGenerator20.addList(node45, false, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"hi!\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"hi!\"'" + "'", str1, "'\"hi!\"'");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray10 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap11 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes12 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray10, variableMap11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        char[] charArray24 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler17, false, charArray24, variableMap25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        char[] charArray35 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, true, charArray35, variableMap36);
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler15, true, charArray24, variableMap38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        char[] charArray51 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap52 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, false, charArray51, variableMap52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        char[] charArray62 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap63 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler54, true, charArray62, variableMap63);
        com.google.javascript.jscomp.VariableMap variableMap65 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes66 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler42, true, charArray51, variableMap65);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        char[] charArray75 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap76 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes77 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler67, true, charArray75, variableMap76);
        com.google.javascript.jscomp.VariableMap variableMap78 = renamePrototypes77.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap79 = renamePrototypes77.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap80 = renamePrototypes77.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes81 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler40, false, charArray51, variableMap80);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes82 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler13, true, charArray24, variableMap80);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes83 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray10, variableMap80);
        java.lang.Class<?> wildcardClass84 = variableMap80.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap65);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap78);
        org.junit.Assert.assertNotNull(variableMap79);
        org.junit.Assert.assertNotNull(variableMap80);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"/" + "'", str1, "/\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"/");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", 'a', "\"\"", "/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/", "#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ahi!a" + "'", str6, "ahi!a");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//" + "'", str1, "//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node25, true, context27);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"", config2, errorReporter3);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/\"\\\"hi!\\\"\"/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a/ 44 /a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a/ 44 /a\"" + "'", str1, "\"a/ 44 /a\"");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
            codeGenerator1.add("//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
        codeGenerator33.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node44, false, context46);
        codeGenerator33.addList(node37, true, context46);
        codeGenerator18.addList(node30, true, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node15, (int) ' ', context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node27, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node16, (int) (short) 100, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator14.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator14.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node34, true, context36);
        codeGenerator14.addList(node28, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) (short) 1, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node23);
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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray8 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap9);
        com.google.javascript.jscomp.VariableMap variableMap11 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap12 = renamePrototypes10.getPropertyMap();
        java.lang.Class<?> wildcardClass13 = renamePrototypes10.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap11);
        org.junit.Assert.assertNotNull(variableMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes42 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray11, variableMap41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes42.process(node43, node44);
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
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node26, (int) (short) 100, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///" + "'", str1, "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/hi!/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
            codeGenerator1.addExpr(node13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/44/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/44/\"" + "'", str1, "\"/44/\"");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" /  /  / 44 /  /  / ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'" + "'", str2, "'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node61, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
            codeGenerator1.add("a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.Class<?> wildcardClass63 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"/");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes42 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray11, variableMap41);
        java.lang.Class<?> wildcardClass43 = renamePrototypes42.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        com.google.javascript.jscomp.VariableMap variableMap74 = renamePrototypes73.getPropertyMap();
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes73.process(node75, node76);
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
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap71);
        org.junit.Assert.assertNotNull(variableMap74);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"/" + "'", str2, "/\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"/");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'\\\"hi!\\\"'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/'\\\"hi!\\\"'/\"/" + "'", str2, "/\"/'\\\"hi!\\\"'/\"/");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/a /\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ a/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/a /\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ a/\\\"\"" + "'", str1, "\"\\\"/a /\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ 44 /\\\\\\\"hi!\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/ a/\\\"\"");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"hi!\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"hi!\\\"'\"" + "'", str1, "\"'\\\"hi!\\\"'\"");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'/" + "'", str2, "/'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'/");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", '4', "\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"", "4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4", "\"a/ 44 /a\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4hi!4" + "'", str6, "4hi!4");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
            codeGenerator1.addLeftExpr(node20, (int) ' ', context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"hi!\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\"hi!\\\"'\"/" + "'", str1, "/\"'\\\"hi!\\\"'\"/");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node12, false, context14);
        codeGenerator1.addList(node5, true, context14);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray2 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        char[] charArray11 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler3, true, charArray11, variableMap12);
        com.google.javascript.jscomp.VariableMap variableMap14 = renamePrototypes13.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes13.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes16 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray2, variableMap15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes16.process(node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap14);
        org.junit.Assert.assertNotNull(variableMap15);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.Class<?> wildcardClass44 = renamePrototypes41.getClass();
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray38 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap39 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes40 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, false, charArray38, variableMap39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray49 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap50 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes51 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray49, variableMap50);
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray38, variableMap52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        char[] charArray62 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap63 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler54, true, charArray62, variableMap63);
        com.google.javascript.jscomp.VariableMap variableMap65 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap66 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap67 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, false, charArray38, variableMap67);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes69 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray11, variableMap67);
        com.google.javascript.jscomp.VariableMap variableMap70 = renamePrototypes69.getPropertyMap();
        java.lang.Class<?> wildcardClass71 = renamePrototypes69.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertArrayEquals(charArray38, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap65);
        org.junit.Assert.assertNotNull(variableMap66);
        org.junit.Assert.assertNotNull(variableMap67);
        org.junit.Assert.assertNotNull(variableMap70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
        java.lang.Class<?> wildcardClass24 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes41.process(node42, node43);
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
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"/", 'a', "'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'", "\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"", "/\"\\\"hi!\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'///\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'hi!/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'//'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/a" + "'", str6, "a/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'///\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'hi!/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'//'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/a");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"/ 44 /\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/hi!/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/hi!/\"" + "'", str2, "\"/hi!/\"");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"\\\"hi!\\\"\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"\\\\\"hi!\\\\\"\"//'" + "'", str2, "'//\"\\\\\"hi!\\\\\"\"//'");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator10.addList(node22, false, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node7, (int) 'a', context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'", "/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/", "/hi!/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\"/ 44 /\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\"/ 44 /\"/'" + "'", str1, "'/\"/ 44 /\"/'");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'" + "'", str2, "'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'" + "'", str2, "'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'///\"/ 44 /\"///'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'///\\\"/ 44 /\\\"///'\"" + "'", str2, "\"'///\\\"/ 44 /\\\"///'\"");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ", ' ', "//\"/ 44 /\"//", "' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '", "'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"// 44 //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"//  " + "'", str6, "  //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"// 44 //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"//  ");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator15.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator15.addList(node25);
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
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator30.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node50, true, context52);
        codeGenerator30.addList(node44, false, context52);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator58.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator58.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        java.nio.charset.Charset charset70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69, charset70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addAllSiblings(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator75.addList(node80, false);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator75.addList(node83, true, context85);
        codeGenerator71.addList(node72, false, context85);
        codeGenerator58.addList(node67, true, context85);
        codeGenerator30.addList(node55, false, context85);
        codeGenerator15.addList(node27, false, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/ 44 /\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/ 44 /\\\"\"" + "'", str1, "\"\\\"/ 44 /\\\"\"");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//'\"hi!\"'//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'/\"/ 44 /\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\"/ 44 /\\\"/'/\"" + "'", str1, "\"/'/\\\"/ 44 /\\\"/'/\"");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.Class<?> wildcardClass57 = renamePrototypes56.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/" + "'", str2, "/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.lang.Class<?> wildcardClass16 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"//" + "'", str2, "//\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"//");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" //44/'\"\"' 44 '\"\"'/44// ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"" + "'", str2, "\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'//\"\\\\\"hi!\\\\\"\"//'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'//\"\\\\\\\\\"hi!\\\\\\\\\"\"//\\''" + "'", str2, "'\\'//\"\\\\\\\\\"hi!\\\\\\\\\"\"//\\''");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /" + "'", str1, "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"" + "'", str1, "\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.rhino.Node node89 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes87.process(node88, node89);
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
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
            codeGenerator1.add("\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node32, true, context34);
        codeGenerator12.addList(node26, false, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, (int) (short) 0, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\" 44 \"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'\" 44 \"'//" + "'", str2, "//'\" 44 \"'//");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//44//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///44///" + "'", str1, "///44///");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/  /" + "'", str2, "/  /");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'\"\"'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'/'" + "'", str2, "'/\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'/'");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'/" + "'", str2, "/'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'/");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//" + "'", str1, "//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("hi!", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"hi!\"" + "'", str2, "\"hi!\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"aa\"" + "'", str1, "\"aa\"");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4hi!4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"4hi!4\"" + "'", str2, "\"4hi!4\"");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\"'/" + "'", str2, "/'\"\"'/");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes34.process(node35, node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///'\"hi!\"'///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///'\\\"hi!\\\"'///\"" + "'", str1, "\"///'\\\"hi!\\\"'///\"");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"" + "'", str1, "\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/\"\\\"/ 44 /\\\"\"/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes43.process(node44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\"", '#', "//'\" 44 \"'//", "\"hi!\"", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#" + "'", str6, "#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
            codeGenerator1.addExpr(node13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  ", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
            codeGenerator1.add(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes44 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray13, variableMap43);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler45 = null;
        char[] charArray53 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap54 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes55 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler45, true, charArray53, variableMap54);
        com.google.javascript.jscomp.VariableMap variableMap56 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap57 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap58 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap59 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap60 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap61 = renamePrototypes55.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes62 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray13, variableMap61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes62.process(node63, node64);
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
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap56);
        org.junit.Assert.assertNotNull(variableMap57);
        org.junit.Assert.assertNotNull(variableMap58);
        org.junit.Assert.assertNotNull(variableMap59);
        org.junit.Assert.assertNotNull(variableMap60);
        org.junit.Assert.assertNotNull(variableMap61);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'" + "'", str1, "'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node27, true, context29);
        codeGenerator1.addList(node16, false, context29);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator35.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator35.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58, false);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator57.addList(node61, false, context63);
        codeGenerator50.addList(node54, true, context63);
        codeGenerator35.addList(node47, true, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node32, (int) '4', context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        java.lang.Class<?> wildcardClass44 = variableMap40.getClass();
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
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
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator9.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node29, true, context31);
        codeGenerator9.addList(node23, false, context31);
        codeGenerator2.addList(node6, false, context31);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"aa\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"aa\\\"\"" + "'", str1, "\"\\\"aa\\\"\"");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"\\\"/ 44 /\\\"\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"'\\\"hi!\\\"'\"/");
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
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator14.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator14.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator14.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node48, true, context50);
        codeGenerator36.addList(node37, false, context50);
        codeGenerator14.addList(node33, true, context50);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) (short) 1, context50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ " + "'", str1, " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"\" 44 \"'\"\\\\\"hi!\\\\\"\"'hi!\" 44 \"'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"'\"\\\\\"hi!\\\\\"\"'#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"\" 44 \"'\"\\\\\"hi!\\\\\"\"'hi!\" 44 \"'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"'\"\\\\\"hi!\\\\\"\"'#" + "'", str1, "#'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"\" 44 \"'\"\\\\\"hi!\\\\\"\"'hi!\" 44 \"'\"\\\\\"hi!\\\\\"\"'\"'\\\"hi!\\\"'\"'\"\\\\\"hi!\\\\\"\"'#");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node15, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
            codeGenerator1.addLeftExpr(node24, 1, context54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
            codeGenerator1.add(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\" 44 \\\"\"", '#', "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///", "//'\" 44 \"'//", " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#" + "'", str6, "#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4hi!4/" + "'", str1, "/4hi!4/");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\\'//\"\\\\\\\\\"hi!\\\\\\\\\"\"//\\''");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, 10, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "ahi!a", "\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"", "\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'" + "'", str1, "'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\\\"hi!\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str1, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
            codeGenerator1.addExpr(node35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///'\"hi!\"'///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\"hi!\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"hi!\"'/" + "'", str1, "/'\"hi!\"'/");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"'\\\"\\\"'\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  " + "'", str1, "  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  ");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\" 44 \"", '#', "4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4", "\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"", "/hi!/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#" + "'", str6, "#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addList(node13, false);
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator39.addList(node45, false, context47);
        codeGenerator19.addList(node36, true, context47);
        codeGenerator10.addList(node16, false, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8, context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'///\"/ 44 /\"///'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'///\\\"/ 44 /\\\"///'\"" + "'", str1, "\"'///\\\"/ 44 /\\\"///'\"");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"4hi!4\"", 'a', "'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'", "ahi!a", "'\"hi!\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'4hi!4'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'a" + "'", str6, "a'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'4hi!4'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'a");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'" + "'", str2, "'\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\"\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/'\\\"\\\"'/\"" + "'", str2, "\"/'\\\"\\\"'/\"");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'" + "'", str1, "'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator26.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node32, true, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator26.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator26.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator26.addList(node43, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node24, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'\\\"\\\"'\"/" + "'", str2, "/\"'\\\"\\\"'\"/");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/aa/" + "'", str1, "/aa/");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'/" + "'", str2, "/'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'/");
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
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"\\\"hi!\\\"\"///");
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
        java.lang.Class<?> wildcardClass23 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'/" + "'", str1, "/'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'/");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"", config2, errorReporter3);
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
            codeGenerator2.add("#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.Class<?> wildcardClass22 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/\"/ 44 /\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'/\"/ 44 /\"/'//" + "'", str1, "//'/\"/ 44 /\"/'//");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        com.google.javascript.jscomp.VariableMap variableMap87 = renamePrototypes85.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes88 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray13, variableMap87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.rhino.Node node90 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes88.process(node89, node90);
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
        org.junit.Assert.assertNotNull(variableMap87);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"" + "'", str1, "\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/\"/\\\"/ 44 /\\\"/\"/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/'\"\"'/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
            codeGenerator1.addExpr(node16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/" + "'", str2, "/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator27.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator27.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator27.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator27.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator27.addList(node42, true, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node24, (int) (short) 0, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
            codeGenerator1.add("\"/'\\\"hi!\\\"'/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray10 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap11 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes12 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray10, variableMap11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        char[] charArray24 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler17, false, charArray24, variableMap25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        char[] charArray35 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, true, charArray35, variableMap36);
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler15, true, charArray24, variableMap38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        char[] charArray51 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap52 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, false, charArray51, variableMap52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        char[] charArray62 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap63 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes64 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler54, true, charArray62, variableMap63);
        com.google.javascript.jscomp.VariableMap variableMap65 = renamePrototypes64.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes66 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler42, true, charArray51, variableMap65);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        char[] charArray75 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap76 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes77 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler67, true, charArray75, variableMap76);
        com.google.javascript.jscomp.VariableMap variableMap78 = renamePrototypes77.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap79 = renamePrototypes77.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap80 = renamePrototypes77.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes81 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler40, false, charArray51, variableMap80);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes82 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler13, true, charArray24, variableMap80);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes83 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray10, variableMap80);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.rhino.Node node85 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes83.process(node84, node85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertArrayEquals(charArray51, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertArrayEquals(charArray62, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap65);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertArrayEquals(charArray75, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap78);
        org.junit.Assert.assertNotNull(variableMap79);
        org.junit.Assert.assertNotNull(variableMap80);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.Class<?> wildcardClass42 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/'\" 44 \"'/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray8 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap9 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes10 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray8, variableMap9);
        com.google.javascript.jscomp.VariableMap variableMap11 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap12 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap13 = renamePrototypes10.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap14 = renamePrototypes10.getPropertyMap();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes10.process(node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap11);
        org.junit.Assert.assertNotNull(variableMap12);
        org.junit.Assert.assertNotNull(variableMap13);
        org.junit.Assert.assertNotNull(variableMap14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/" + "'", str1, "/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'/\\\"/ 44 /\\\"/'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/'/\\\"/ 44 /\\\"/'/\"/" + "'", str2, "/\"/'/\\\"/ 44 /\\\"/'/\"/");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

