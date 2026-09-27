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
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CompilerOptions compilerOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, compilerOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node5, context6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/hi!/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/hi!/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node2);
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/hi!/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/hi!/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str1, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("hi!");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/hi!/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//hi!//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//hi!//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.Class<?> wildcardClass18 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        java.lang.String str17 = codeGenerator12.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator12.addList(node20, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.Class<?> wildcardClass5 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//hi!//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//hi!//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"hi!\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"/hi!/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"/hi!/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/hi!/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("", charsetEncoder7);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//" + "'", str8, "//");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        java.lang.String str13 = codeGenerator8.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator8.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator8.addArrayList(node16);
        java.lang.String str19 = codeGenerator8.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str21 = codeGenerator8.regexpEscape("hi!");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26, false);
        java.lang.String str30 = codeGenerator25.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addArrayList(node33);
        java.lang.String str36 = codeGenerator25.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator25.addList(node37, true, context39);
        codeGenerator8.addList(node22, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"hi!\"" + "'", str19, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/hi!/" + "'", str21, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"" + "'", str30, "\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"hi!\"" + "'", str36, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        java.lang.String str18 = codeGenerator13.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator13.addArrayList(node21);
        java.lang.String str24 = codeGenerator13.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str26 = codeGenerator13.regexpEscape("hi!");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        java.lang.String str35 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addArrayList(node38);
        java.lang.String str41 = codeGenerator30.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node42, true, context44);
        codeGenerator13.addList(node27, false, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"hi!\"" + "'", str24, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/hi!/" + "'", str26, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"hi!\"" + "'", str41, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("///\"//\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/hi!/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node14, true, context16);
        java.lang.Class<?> wildcardClass18 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str1, "//\"//\\\"hi!\\\"//\"//");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"//\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//\"//" + "'", str1, "//\"//\"//");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"hi!\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"hi!\\\"//\"" + "'", str1, "\"//\\\"hi!\\\"//\"");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        java.lang.String str26 = codeGenerator20.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        java.lang.String str30 = codeGenerator20.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node34, false, context36);
        codeGenerator12.addList(node17, false, context36);
        codeGenerator1.addList(node9, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"//\"" + "'", str30, "\"//\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"\\\"/hi!/\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///hi!///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///hi!///" + "'", str1, "///hi!///");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"hi!\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str1, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        java.lang.Class<?> wildcardClass18 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        java.lang.String str19 = codeGenerator14.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node22, false, context24);
        codeGenerator1.addList(node11, false, context24);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\\\"\\\"//\"/");
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str19, "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////\"//\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///hi!///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node11, true, context13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"//\\\"\\\"//\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        java.lang.String str29 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"//\"" + "'", str29, "\"//\"");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"hi!\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        java.lang.String str42 = codeGenerator36.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator36.addList(node43);
        java.lang.String str46 = codeGenerator36.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator36.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator36.addList(node50, false, context52);
        codeGenerator28.addList(node33, false, context52);
        codeGenerator17.addList(node25, false, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"/hi!/\"" + "'", str42, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"//\"" + "'", str46, "\"//\"");
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.String str19 = codeGenerator1.regexpEscape("//\"hi!\"//");
        java.lang.Class<?> wildcardClass20 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "///\"hi!\"///" + "'", str19, "///\"hi!\"///");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.lang.Class<?> wildcardClass13 = context11.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addArrayList(node36);
        java.lang.String str39 = codeGenerator33.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator33.addList(node40);
        java.lang.String str43 = codeGenerator33.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator33.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator33.addList(node47, false, context49);
        codeGenerator25.addList(node30, false, context49);
        codeGenerator14.addList(node22, false, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"/hi!/\"" + "'", str39, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"//\"" + "'", str43, "\"//\"");
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator32.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addArrayList(node54);
        java.lang.String str57 = codeGenerator51.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator51.addList(node58);
        java.lang.String str61 = codeGenerator51.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator51.addList(node62, false);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator51.addList(node65, false, context67);
        codeGenerator43.addList(node48, false, context67);
        codeGenerator32.addList(node40, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node30, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator32);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertNotNull(codeGenerator51);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"/hi!/\"" + "'", str57, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"//\"" + "'", str61, "\"//\"");
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        java.lang.String str21 = codeGenerator16.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node24, false, context26);
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.lang.String str30 = codeGenerator16.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder29);
        java.nio.charset.CharsetEncoder charsetEncoder32 = null;
        java.lang.String str33 = codeGenerator16.regexpEscape("///\"//\"///", charsetEncoder32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node34, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str30, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "////\"//\"////" + "'", str33, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("/\"\"/", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"/hi!/\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "//\"\"//" + "'", str6, "//\"\"//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"/hi!/\"/" + "'", str11, "/\"/hi!/\"/");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        java.lang.String str26 = codeGenerator20.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        java.lang.String str30 = codeGenerator20.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node34, false, context36);
        codeGenerator12.addList(node17, false, context36);
        codeGenerator1.addList(node9, false, context36);
        java.lang.Class<?> wildcardClass40 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"//\"" + "'", str30, "\"//\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.String str19 = codeGenerator1.regexpEscape("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\\\"hi!\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"hi!\"/" + "'", str19, "/\"hi!\"/");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/hi!/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8, context9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addAllSiblings(node18);
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.lang.String str22 = codeGenerator12.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator12.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator28.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addArrayList(node50);
        java.lang.String str53 = codeGenerator47.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator47.addList(node54);
        java.lang.String str57 = codeGenerator47.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator47.addList(node58, false);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator47.addList(node61, false, context63);
        codeGenerator39.addList(node44, false, context63);
        codeGenerator28.addList(node36, false, context63);
        codeGenerator12.addList(node25, true, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str22, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertNotNull(codeGenerator39);
        org.junit.Assert.assertNotNull(codeGenerator47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"/hi!/\"" + "'", str53, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"//\"" + "'", str57, "\"//\"");
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/hi!/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"hi!\"/" + "'", str15, "/\"hi!\"/");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        java.lang.String str23 = codeGenerator18.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator18.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node28, false, context30);
        codeGenerator10.addList(node15, true, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator10);
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"//\"/" + "'", str27, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\"" + "'", str7, "\"//\"");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"\\\"/hi!/\\\"\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///hi!///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"hi!\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"//\\\"\\\"//\"" + "'", str12, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///hi!///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        java.lang.String str26 = codeGenerator20.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        java.lang.String str30 = codeGenerator20.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node34, false, context36);
        codeGenerator12.addList(node17, false, context36);
        codeGenerator1.addList(node9, false, context36);
        java.lang.String str41 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/hi!/\"/");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator44.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addArrayList(node66);
        java.lang.String str69 = codeGenerator63.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator63.addList(node70);
        java.lang.String str73 = codeGenerator63.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator63.addList(node74, false);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator63.addList(node77, false, context79);
        codeGenerator55.addList(node60, false, context79);
        codeGenerator44.addList(node52, false, context79);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node42, context79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"//\"" + "'", str30, "\"//\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"/\\\"/hi!/\\\"/\"" + "'", str41, "\"/\\\"/hi!/\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator44);
        org.junit.Assert.assertNotNull(codeGenerator55);
        org.junit.Assert.assertNotNull(codeGenerator63);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"/hi!/\"" + "'", str69, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"//\"" + "'", str73, "\"//\"");
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator19.addList(node23, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, false);
        java.lang.String str14 = codeGenerator9.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator9.addArrayList(node17);
        java.lang.String str20 = codeGenerator9.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator9.addList(node21, true, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"////\"" + "'", str7, "\"////\"");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str17, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\\\"hi!\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = null;
        codeGenerator1.addList(node8, true, context10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.lang.String str32 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/", charsetEncoder31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str32, "//\"//\\\"hi!\\\"//\"//");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str13, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/hi!/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/hi!/\"/" + "'", str1, "/\"/hi!/\"/");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("////\"//\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        java.lang.String str19 = codeGenerator14.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addAllSiblings(node20);
        java.lang.String str23 = codeGenerator14.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node24, false, context26);
        codeGenerator6.addList(node11, true, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/" + "'", str3, "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator6);
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/\"//\"/" + "'", str23, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"/hi!/\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        java.lang.String str35 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addAllSiblings(node36);
        java.lang.String str39 = codeGenerator30.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node40, false, context42);
        codeGenerator22.addList(node27, true, context42);
        codeGenerator1.addList(node19, true, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "/\"//\"/" + "'", str39, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/hi!/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///hi!///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        java.lang.Class<?> wildcardClass15 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        java.lang.String str19 = codeGenerator14.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node22, false, context24);
        codeGenerator1.addList(node11, false, context24);
        java.lang.Class<?> wildcardClass27 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        java.lang.String str35 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addAllSiblings(node36);
        java.lang.String str39 = codeGenerator30.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node40, false, context42);
        codeGenerator22.addList(node27, true, context42);
        codeGenerator1.addList(node19, true, context42);
        java.lang.Class<?> wildcardClass46 = context42.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "/\"//\"/" + "'", str39, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/hi!/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/hi!/\"//" + "'", str1, "//\"/hi!/\"//");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        java.lang.Class<?> wildcardClass20 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"//\\\"\\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\\\"\\\"//\"/");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str19, "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        java.lang.String str23 = codeGenerator18.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        java.lang.String str29 = codeGenerator18.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node30, true, context32);
        codeGenerator1.addList(node15, false, context32);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"hi!\"" + "'", str29, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        java.lang.Class<?> wildcardClass16 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"//\\\"hi!\\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("///\"//\\\"hi!\\\"//\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder16);
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("///\"\\\"/hi!/\\\"\"///", charsetEncoder19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str17, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "////\"\\\"/hi!/\\\"\"////" + "'", str20, "////\"\\\"/hi!/\\\"\"////");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////\"//\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"///\\\"//\\\"///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str1, "\"///\\\"//\\\"///\"");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addAllSiblings(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator13.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator13.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator29.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addArrayList(node51);
        java.lang.String str54 = codeGenerator48.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addList(node55);
        java.lang.String str58 = codeGenerator48.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator48.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator48.addList(node62, false, context64);
        codeGenerator40.addList(node45, false, context64);
        codeGenerator29.addList(node37, false, context64);
        codeGenerator13.addList(node26, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str10, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str23, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator29);
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertNotNull(codeGenerator48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"/hi!/\"" + "'", str54, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"//\"" + "'", str58, "\"//\"");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"//\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"//\\\"\\\"//\"" + "'", str15, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.escapeToDoubleQuotedJsString("//\"hi!\"//");
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"//\\\"hi!\\\"//\"" + "'", str3, "\"//\\\"hi!\\\"//\"");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\"/" + "'", str1, "/\"//\"/");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addArrayList(node22);
        java.lang.String str25 = codeGenerator19.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26);
        java.lang.String str29 = codeGenerator19.escapeToDoubleQuotedJsString("//");
        java.lang.String str31 = codeGenerator19.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node32, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str16, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"/hi!/\"" + "'", str25, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"//\"" + "'", str29, "\"//\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str31, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        java.lang.String str35 = codeGenerator30.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.lang.String str38 = codeGenerator30.regexpEscape("", charsetEncoder37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator30.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator44.addList(node49, false);
        java.lang.String str53 = codeGenerator44.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator44.addList(node54, false, context56);
        codeGenerator30.addList(node41, false, context56);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node28, context56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"\"" + "'", str35, "\"\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "//" + "'", str38, "//");
        org.junit.Assert.assertNotNull(codeGenerator44);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "///\"//\"///" + "'", str53, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str15, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"hi!\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("////\"\\\"/hi!/\\\"\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node14, true, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        java.lang.String str25 = codeGenerator20.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addAllSiblings(node26);
        java.lang.String str29 = codeGenerator20.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node30, false, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str13, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/\"//\"/" + "'", str29, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"///\\\"//\\\"///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addArrayList(node18);
        java.lang.String str21 = codeGenerator15.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addList(node22);
        java.lang.String str25 = codeGenerator15.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator15.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node29, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"/hi!/\"" + "'", str21, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"//\"" + "'", str25, "\"//\"");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str12 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        java.lang.String str20 = codeGenerator15.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator15.regexpEscape("", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        java.lang.String str38 = codeGenerator29.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator29.addList(node39, false, context41);
        codeGenerator15.addList(node26, false, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//\"\"//" + "'", str12, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//" + "'", str23, "//");
        org.junit.Assert.assertNotNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "///\"//\"///" + "'", str38, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addArrayList(node33);
        java.lang.String str36 = codeGenerator30.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator30.addList(node37);
        java.lang.String str40 = codeGenerator30.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator30.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator30.addList(node44, false, context46);
        codeGenerator22.addList(node27, false, context46);
        codeGenerator11.addList(node19, false, context46);
        codeGenerator1.addList(node8, false, context46);
        java.lang.Class<?> wildcardClass51 = context46.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"/hi!/\"" + "'", str36, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"//\"" + "'", str40, "\"//\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node11, false, context13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"//\"///" + "'", str10, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addArrayList(node25);
        java.lang.String str28 = codeGenerator22.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29);
        java.lang.String str32 = codeGenerator22.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator22.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator22.addList(node36, false, context38);
        codeGenerator14.addList(node19, false, context38);
        codeGenerator1.addList(node11, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"/hi!/\"" + "'", str28, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"//\"" + "'", str32, "\"//\"");
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        java.lang.Class<?> wildcardClass2 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.lang.String str30 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder29);
        java.lang.Class<?> wildcardClass31 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str30, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\"///" + "'", str1, "///\"\"///");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"", charsetEncoder10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/" + "'", str11, "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////\"\\\"/hi!/\\\"\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str13, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str10, "/////\"\\\"/hi!/\\\"\"/////");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"\\\"/hi!/\\\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\\\"/hi!/\\\"\"///" + "'", str1, "///\"\\\"/hi!/\\\"\"///");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16, context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"hi!\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"//\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator23.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node33, true, context35);
        codeGenerator1.addList(node20, true, context35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41, false);
        java.lang.String str45 = codeGenerator40.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator40.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator40.addList(node48, false, context50);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node38, context50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"//\\\"\\\"//\"" + "'", str12, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//hi!//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"hi!\"//", charsetEncoder12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str10, "/////\"\\\"/hi!/\\\"\"/////");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"hi!\"///" + "'", str13, "///\"hi!\"///");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\"" + "'", str7, "\"//\"");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str1, "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/hi!/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str1, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"hi!\"");
        java.lang.Class<?> wildcardClass16 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"hi!\"/" + "'", str15, "/\"hi!\"/");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"", charsetEncoder11);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"/hi!/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        java.lang.String str12 = codeGenerator1.regexpEscape("///\"//\\\"hi!\\\"//\"///");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/hi!/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "////\"//\\\"hi!\\\"//\"////" + "'", str12, "////\"//\\\"hi!\\\"//\"////");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/hi!/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//\\\"hi!\\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str17, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("///hi!///");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"///hi!///\"" + "'", str13, "\"///hi!///\"");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addArrayList(node22);
        java.lang.String str25 = codeGenerator19.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26);
        java.lang.String str29 = codeGenerator19.escapeToDoubleQuotedJsString("//");
        java.lang.String str31 = codeGenerator19.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node32, true, context34);
        codeGenerator1.addList(node16, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"/hi!/\"" + "'", str25, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"//\"" + "'", str29, "\"//\"");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str31, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\\\"hi!\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\\\"hi!\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.regexpEscape("//");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator10.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator10.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator10.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator10.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////" + "'", str7, "////");
        org.junit.Assert.assertNotNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\\\"\\\"//\"/");
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str19, "\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
        java.lang.Class<?> wildcardClass4 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/" + "'", str3, "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"hi!\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"hi!\"//" + "'", str1, "//\"hi!\"//");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("\"/hi!/\"", charsetEncoder8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"/hi!/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/\"/hi!/\"/" + "'", str9, "/\"/hi!/\"/");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator30.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addArrayList(node52);
        java.lang.String str55 = codeGenerator49.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator49.addList(node56);
        java.lang.String str59 = codeGenerator49.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator49.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator49.addList(node63, false, context65);
        codeGenerator41.addList(node46, false, context65);
        codeGenerator30.addList(node38, false, context65);
        codeGenerator20.addList(node27, false, context65);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18, context65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertNotNull(codeGenerator41);
        org.junit.Assert.assertNotNull(codeGenerator49);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"/hi!/\"" + "'", str55, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"//\"" + "'", str59, "\"//\"");
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.escapeToDoubleQuotedJsString("//\"hi!\"//");
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"//\\\"hi!\\\"//\"" + "'", str3, "\"//\\\"hi!\\\"//\"");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"hi!\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/" + "'", str1, "/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str10, "/////\"\\\"/hi!/\\\"\"/////");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34, false);
        java.lang.String str38 = codeGenerator33.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator33.addArrayList(node41);
        java.lang.String str44 = codeGenerator33.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator33.addList(node45, true, context47);
        codeGenerator18.addList(node30, true, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16, context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"hi!\"" + "'", str44, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("///hi!///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.lang.Class<?> wildcardClass16 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.nio.charset.CharsetEncoder charsetEncoder6 = null;
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str7, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"//\"///" + "'", str10, "///\"//\"///");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\"" + "'", str7, "\"//\"");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//\"///");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str12, "\"///\\\"//\\\"///\"");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        java.lang.Class<?> wildcardClass10 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"//\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"//\"///" + "'", str1, "///\"//\"///");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "///\"//\"///" + "'", str10, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"///hi!///\"");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"///hi!///\"/" + "'", str10, "/\"///hi!///\"/");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("////\"\\\"/hi!/\\\"\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"\\\"/hi!/\\\"\"////" + "'", str1, "////\"\\\"/hi!/\\\"\"////");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"//\\\"hi!\\\"//\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        java.lang.String str20 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"///hi!///\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"hi!\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"///hi!///\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"///hi!///\\\\\\\"\\\"\"");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder17);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str18, "/////\"\\\"/hi!/\\\"\"/////");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        java.lang.String str21 = codeGenerator16.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.lang.String str24 = codeGenerator16.regexpEscape("", charsetEncoder23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        java.lang.String str39 = codeGenerator30.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node40, false, context42);
        codeGenerator16.addList(node27, false, context42);
        codeGenerator1.addList(node13, false, context42);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node46, context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//\"hi!\"//" + "'", str12, "//\"hi!\"//");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "//" + "'", str24, "//");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "///\"//\"///" + "'", str39, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////\"//\\\"hi!\\\"//\"////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.lang.String str19 = codeGenerator1.regexpEscape("//\"hi!\"//");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        java.lang.String str27 = codeGenerator22.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator22.addArrayList(node30);
        java.lang.String str33 = codeGenerator22.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node34, true, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "///\"hi!\"///" + "'", str19, "///\"hi!\"///");
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"hi!\"" + "'", str33, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/////\"\\\"/hi!/\\\"\"/////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str1, "/////\"\\\"/hi!/\\\"\"/////");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        java.lang.String str24 = codeGenerator19.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator19.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addAllSiblings(node40);
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.lang.String str44 = codeGenerator34.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator34.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator50.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator69.addArrayList(node72);
        java.lang.String str75 = codeGenerator69.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator69.addList(node76);
        java.lang.String str79 = codeGenerator69.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator69.addList(node80, false);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator69.addList(node83, false, context85);
        codeGenerator61.addList(node66, false, context85);
        codeGenerator50.addList(node58, false, context85);
        codeGenerator34.addList(node47, true, context85);
        codeGenerator19.addList(node31, false, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str16, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str44, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator50);
        org.junit.Assert.assertNotNull(codeGenerator61);
        org.junit.Assert.assertNotNull(codeGenerator69);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "\"/hi!/\"" + "'", str75, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "\"//\"" + "'", str79, "\"//\"");
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"//\"" + "'", str9, "\"//\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"//\"");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"hi!\\\"//\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"" + "'", str9, "\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str1, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str15, "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, false);
        java.lang.String str14 = codeGenerator9.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addAllSiblings(node15);
        java.lang.String str18 = codeGenerator9.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node19, false, context21);
        codeGenerator1.addList(node6, true, context21);
        java.lang.Class<?> wildcardClass24 = context21.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"//\"/" + "'", str18, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node28, true, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\"\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        java.lang.Class<?> wildcardClass16 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"////\"" + "'", str15, "\"////\"");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"/" + "'", str1, "/\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"/");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("//\"//\\\"hi!\\\"//\"//");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "///\"//\\\"hi!\\\"//\"///" + "'", str12, "///\"//\\\"hi!\\\"//\"///");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"///\\\"hi!\\\"///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"hi!\\\"///\"" + "'", str1, "\"///\\\"hi!\\\"///\"");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator14.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addArrayList(node46);
        java.lang.String str49 = codeGenerator43.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator43.addList(node50);
        java.lang.String str53 = codeGenerator43.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator43.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator43.addList(node57, false, context59);
        codeGenerator35.addList(node40, false, context59);
        codeGenerator24.addList(node32, false, context59);
        codeGenerator14.addList(node21, false, context59);
        codeGenerator1.addList(node11, true, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertNotNull(codeGenerator35);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"/hi!/\"" + "'", str49, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"//\"" + "'", str53, "\"//\"");
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str18, "/////\"\\\"/hi!/\\\"\"/////");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"/hi!/\\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        java.lang.String str23 = codeGenerator18.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        java.lang.String str29 = codeGenerator18.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node30, true, context32);
        codeGenerator1.addList(node15, false, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"hi!\"" + "'", str29, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.regexpEscape("/\"//\"/");
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "//\"//\"//" + "'", str6, "//\"//\"//");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("////hi!////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, false);
        java.lang.String str14 = codeGenerator9.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addAllSiblings(node15);
        java.lang.String str18 = codeGenerator9.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node19, false, context21);
        codeGenerator1.addList(node6, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"//\"/" + "'", str18, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        java.lang.String str27 = codeGenerator22.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator22.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37, false);
        java.lang.String str41 = codeGenerator36.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator36.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator36.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addArrayList(node60);
        java.lang.String str63 = codeGenerator57.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator57.addList(node64);
        java.lang.String str67 = codeGenerator57.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator57.addList(node68, false);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node71, false, context73);
        codeGenerator49.addList(node54, false, context73);
        codeGenerator36.addList(node46, true, context73);
        codeGenerator22.addList(node33, true, context73);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20, context73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator49);
        org.junit.Assert.assertNotNull(codeGenerator57);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\"/hi!/\"" + "'", str63, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"//\"" + "'", str67, "\"//\"");
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////\"//\\\"hi!\\\"//\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        java.lang.String str22 = codeGenerator17.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator17.addList(node29);
        java.lang.String str32 = codeGenerator17.regexpEscape("/\"//\\\"hi!\\\"//\"/");
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node33, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str32, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////\"\\\"/hi!/\\\"\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        java.nio.charset.CharsetEncoder charsetEncoder29 = null;
        java.lang.String str30 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"///\\\"hi!\\\"///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str30, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("\"hi!\"");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"/hi!/\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str19, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("//\"//\\\"hi!\\\"//\"//");
        java.lang.String str14 = codeGenerator1.regexpEscape("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "///\"//\\\"hi!\\\"//\"///" + "'", str12, "///\"//\\\"hi!\\\"//\"///");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "///\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"///" + "'", str14, "///\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"///");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        java.lang.String str21 = codeGenerator16.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.lang.String str24 = codeGenerator16.regexpEscape("", charsetEncoder23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        java.lang.String str39 = codeGenerator30.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node40, false, context42);
        codeGenerator16.addList(node27, false, context42);
        codeGenerator1.addList(node13, false, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//\"hi!\"//" + "'", str12, "//\"hi!\"//");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "//" + "'", str24, "//");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "///\"//\"///" + "'", str39, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        java.lang.String str21 = codeGenerator1.regexpEscape("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer23);
        java.lang.String str26 = codeGenerator24.regexpEscape("hi!");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node34, false, context36);
        codeGenerator24.addList(node27, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node22, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/\"//\\\"\\\"//\"/" + "'", str21, "/\"//\\\"\\\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/hi!/" + "'", str26, "/hi!/");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"hi!\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"///\\\"//\\\"///\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        java.lang.Class<?> wildcardClass7 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator17.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node30, true, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        java.lang.String str26 = codeGenerator20.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        java.lang.String str30 = codeGenerator20.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node34, false, context36);
        codeGenerator12.addList(node17, false, context36);
        codeGenerator1.addList(node9, false, context36);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"//\"" + "'", str30, "\"//\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"hi!\"", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder17);
        java.lang.Class<?> wildcardClass19 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"hi!\"/" + "'", str13, "/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str18, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.jscomp.CodeGenerator.Context context0 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        java.lang.Class<?> wildcardClass1 = context0.getClass();
        org.junit.Assert.assertTrue("'" + context0 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context0.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("\"//\"", charsetEncoder16);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("\"hi!\"");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        java.nio.charset.CharsetEncoder charsetEncoder24 = null;
        java.lang.String str25 = codeGenerator1.regexpEscape("/\"hi!\"/", charsetEncoder24);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"//\"/" + "'", str17, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str19, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "//\"hi!\"//" + "'", str25, "//\"hi!\"//");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.lang.Class<?> wildcardClass17 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str18, "/////\"\\\"/hi!/\\\"\"/////");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        java.lang.String str26 = codeGenerator20.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        java.lang.String str30 = codeGenerator20.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node34, false, context36);
        codeGenerator12.addList(node17, false, context36);
        codeGenerator1.addList(node9, false, context36);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator1.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator1.addArrayList(node43);
        java.nio.charset.CharsetEncoder charsetEncoder46 = null;
        java.lang.String str47 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/", charsetEncoder46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node48, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"//\"" + "'", str30, "\"//\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str47, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str14, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"\"//");
        java.lang.String str15 = codeGenerator1.regexpEscape("//\"hi!\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("//\"\"//");
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"\"///" + "'", str13, "///\"\"///");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "///\"hi!\"///" + "'", str15, "///\"hi!\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "///\"\"///" + "'", str17, "///\"\"///");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"\\\\\\\"/hi!/\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        java.lang.String str8 = codeGenerator1.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        java.lang.String str25 = codeGenerator20.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addAllSiblings(node26);
        java.lang.String str29 = codeGenerator20.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node30, false, context32);
        codeGenerator12.addList(node17, true, context32);
        codeGenerator1.addList(node9, false, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/hi!/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str8, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/\"//\"/" + "'", str29, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        java.lang.String str8 = codeGenerator1.regexpEscape("/hi!/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//hi!//" + "'", str8, "//hi!//");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"///\\\"//\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"//\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str14 = codeGenerator1.regexpEscape("hi!");
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/hi!/" + "'", str14, "/hi!/");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("////\"//\\\"hi!\\\"//\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.lang.String str32 = codeGenerator1.regexpEscape("/\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"/", charsetEncoder31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "//\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"//" + "'", str32, "//\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"//");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"//\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("////\"\\\"/hi!/\\\"\"////", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("\"/\\\"/hi!/\\\"/\"", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29, true);
        java.lang.String str33 = codeGenerator26.escapeToDoubleQuotedJsString("\"///hi!///\"");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        java.lang.String str50 = codeGenerator45.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator45.addAllSiblings(node51);
        java.lang.String str54 = codeGenerator45.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node55, false, context57);
        codeGenerator37.addList(node42, true, context57);
        codeGenerator26.addList(node34, false, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node24, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"/hi!/\"//" + "'", str15, "//\"/hi!/\"//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/////\"\\\"/hi!/\\\"\"/////" + "'", str18, "/////\"\\\"/hi!/\\\"\"/////");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/\"/\\\"/hi!/\\\"/\"/" + "'", str23, "/\"/\\\"/hi!/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\\\"///hi!///\\\"\"" + "'", str33, "\"\\\"///hi!///\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertNotNull(codeGenerator45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"\"" + "'", str50, "\"\"");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "/\"//\"/" + "'", str54, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"", charsetEncoder18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str13, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"/" + "'", str19, "/\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"/");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("/\"\"/", charsetEncoder5);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "//\"\"//" + "'", str6, "//\"\"//");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\"/" + "'", str12, "/\"\"/");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\"/");
        java.lang.String str12 = codeGenerator1.regexpEscape("/\"\"/");
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("///hi!///");
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\"//" + "'", str10, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//\"\"//" + "'", str12, "//\"\"//");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"///hi!///\"" + "'", str14, "\"///hi!///\"");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        java.lang.String str17 = codeGenerator1.regexpEscape("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"hi!\"/" + "'", str17, "/\"hi!\"/");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"////\\\"//\\\"////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node12, false, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"/hi!/\\\"/\"");
        java.lang.Class<?> wildcardClass10 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"" + "'", str9, "\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/////\"//\\\"hi!\\\"//\"/////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"///\\\"\\\\\\\"/hi!/\\\\\\\"\\\"///\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\\\"hi!\\\"//\"");
        java.lang.Class<?> wildcardClass19 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"" + "'", str18, "\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"", charsetEncoder11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.Class<?> wildcardClass15 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/" + "'", str12, "/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"/hi!/\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("", charsetEncoder11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//" + "'", str12, "//");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////hi!////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"", charsetEncoder11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"//\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"//\"" + "'", str9, "\"//\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"//\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"/" + "'", str12, "/\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, false);
        java.lang.String str40 = codeGenerator35.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator35.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator35.addArrayList(node43);
        java.lang.String str46 = codeGenerator35.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator35.addList(node47, true, context49);
        java.lang.String str52 = codeGenerator35.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65, false);
        java.lang.String str69 = codeGenerator64.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator64.addAllSiblings(node70);
        java.lang.String str73 = codeGenerator64.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator64.addList(node74, false, context76);
        codeGenerator56.addList(node61, true, context76);
        codeGenerator35.addList(node53, true, context76);
        codeGenerator1.addList(node32, true, context76);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"hi!\"" + "'", str46, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "//\"\"//" + "'", str52, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator56);
        org.junit.Assert.assertNotNull(codeGenerator64);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "\"\"" + "'", str69, "\"\"");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "/\"//\"/" + "'", str73, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//\"///");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"/hi!/\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str12, "\"///\\\"//\\\"///\"");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        java.lang.String str17 = codeGenerator12.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator12.addList(node20, false, context22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator12.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder25);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator12.regexpEscape("///\"//\"///", charsetEncoder28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator12.addAllSiblings(node34);
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.lang.String str38 = codeGenerator12.regexpEscape("//\"//\"//", charsetEncoder37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator12.addList(node39, true, context41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, false);
        java.lang.String str51 = codeGenerator46.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addArrayList(node54);
        java.lang.String str57 = codeGenerator46.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator46.addList(node58, true, context60);
        java.lang.String str63 = codeGenerator46.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator67.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addList(node76, false);
        java.lang.String str80 = codeGenerator75.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator75.addAllSiblings(node81);
        java.lang.String str84 = codeGenerator75.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator75.addList(node85, false, context87);
        codeGenerator67.addList(node72, true, context87);
        codeGenerator46.addList(node64, true, context87);
        codeGenerator12.addList(node43, true, context87);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"////\"" + "'", str7, "\"////\"");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str26, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "////\"//\"////" + "'", str29, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "///\"//\"///" + "'", str38, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(codeGenerator46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\"" + "'", str51, "\"\"");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"hi!\"" + "'", str57, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "//\"\"//" + "'", str63, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator67);
        org.junit.Assert.assertNotNull(codeGenerator75);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"\"" + "'", str80, "\"\"");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "/\"//\"/" + "'", str84, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"////\"" + "'", str7, "\"////\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"///\\\"\\\\\\\"/hi!/\\\\\\\"\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"//\\\"\\\"//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        java.lang.String str26 = codeGenerator20.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addList(node27);
        java.lang.String str30 = codeGenerator20.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node34, false, context36);
        codeGenerator12.addList(node17, false, context36);
        codeGenerator1.addList(node9, false, context36);
        java.lang.Class<?> wildcardClass40 = context36.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"/hi!/\"" + "'", str26, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"//\"" + "'", str30, "\"//\"");
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"///\\\"hi!\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        java.lang.String str20 = codeGenerator15.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addArrayList(node21);
        java.lang.String str24 = codeGenerator15.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator15.regexpEscape("////\"//\\\"hi!\\\"//\"////", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator15.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34, false);
        java.lang.String str38 = codeGenerator33.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addAllSiblings(node39);
        java.lang.String str42 = codeGenerator33.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node43, false, context45);
        codeGenerator15.addList(node30, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "/hi!/" + "'", str24, "/hi!/");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/////\"//\\\"hi!\\\"//\"/////" + "'", str27, "/////\"//\\\"hi!\\\"//\"/////");
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/\"//\"/" + "'", str42, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"//\\\"\\\"//\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        java.lang.String str20 = codeGenerator15.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator15.addArrayList(node23);
        java.lang.String str26 = codeGenerator15.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator15.addList(node27, true, context29);
        codeGenerator1.addList(node12, false, context29);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addAllSiblings(node40);
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.lang.String str44 = codeGenerator34.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator34.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator34.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addArrayList(node55);
        java.lang.String str58 = codeGenerator52.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator52.addList(node59);
        java.lang.String str62 = codeGenerator52.escapeToDoubleQuotedJsString("//");
        java.lang.String str64 = codeGenerator52.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator52.addList(node65, true, context67);
        codeGenerator34.addList(node49, true, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node32, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"//\\\"\\\"//\"/" + "'", str11, "/\"//\\\"\\\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"hi!\"" + "'", str26, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str44, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"/hi!/\"" + "'", str58, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"//\"" + "'", str62, "\"//\"");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str64, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addArrayList(node33);
        java.lang.String str36 = codeGenerator30.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator30.addList(node37);
        java.lang.String str40 = codeGenerator30.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator30.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator30.addList(node44, false, context46);
        codeGenerator22.addList(node27, false, context46);
        codeGenerator11.addList(node19, false, context46);
        codeGenerator1.addList(node8, false, context46);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator1.addList(node51);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"/hi!/\"" + "'", str36, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"//\"" + "'", str40, "\"//\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("\"\\\"//\\\"\"", charsetEncoder19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        java.lang.String str28 = codeGenerator23.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator23.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38, false);
        java.lang.String str42 = codeGenerator37.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator37.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addArrayList(node61);
        java.lang.String str64 = codeGenerator58.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator58.addList(node65);
        java.lang.String str68 = codeGenerator58.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator58.addList(node69, false);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator58.addList(node72, false, context74);
        codeGenerator50.addList(node55, false, context74);
        codeGenerator37.addList(node47, true, context74);
        codeGenerator23.addList(node34, true, context74);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node21, context74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "/\"\\\"//\\\"\"/" + "'", str20, "/\"\\\"//\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"\"" + "'", str42, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator50);
        org.junit.Assert.assertNotNull(codeGenerator58);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"/hi!/\"" + "'", str64, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"//\"" + "'", str68, "\"//\"");
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("/////\"//\\\"hi!\\\"//\"/////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        java.lang.String str17 = codeGenerator12.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator12.regexpEscape("", charsetEncoder19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator12.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator12.addArrayList(node23);
        java.lang.String str26 = codeGenerator12.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator12.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35);
        java.lang.String str38 = codeGenerator32.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node42, true, context44);
        codeGenerator12.addList(node29, true, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\"" + "'", str7, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//" + "'", str20, "//");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"////\"" + "'", str26, "\"////\"");
        org.junit.Assert.assertNotNull(codeGenerator32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"//\"" + "'", str38, "\"//\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("////\"//\\\"hi!\\\"//\"////", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        java.lang.String str24 = codeGenerator19.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addAllSiblings(node25);
        java.lang.String str28 = codeGenerator19.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node29, false, context31);
        codeGenerator1.addList(node16, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/hi!/" + "'", str10, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/////\"//\\\"hi!\\\"//\"/////" + "'", str13, "/////\"//\\\"hi!\\\"//\"/////");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/\"//\"/" + "'", str28, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        java.lang.Class<?> wildcardClass18 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder10);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str11, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"////\"" + "'", str1, "\"////\"");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        java.lang.String str13 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("\"/hi!/\"");
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"/\\\"/hi!/\\\"/\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////\"//\\\"hi!\\\"//\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str13, "\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"//\\\"\\\"//\"" + "'", str15, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"/\\\"/hi!/\\\"/\"//" + "'", str17, "//\"/\\\"/hi!/\\\"/\"//");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "////\"//\"////" + "'", str17, "////\"//\"////");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"///hi!///\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"///hi!///\"/" + "'", str1, "/\"///hi!///\"/");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/////\"//\\\"hi!\\\"//\"/////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder16);
        java.lang.String str19 = codeGenerator1.regexpEscape("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"//\\\"\"");
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "///hi!///" + "'", str17, "///hi!///");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//" + "'", str19, "//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\"\\\"\"" + "'", str21, "\"\\\"\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.String str14 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"/hi!/\\\"/\"");
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\"//\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"" + "'", str14, "\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator43.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addArrayList(node65);
        java.lang.String str68 = codeGenerator62.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator62.addList(node69);
        java.lang.String str72 = codeGenerator62.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator62.addList(node73, false);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator62.addList(node76, false, context78);
        codeGenerator54.addList(node59, false, context78);
        codeGenerator43.addList(node51, false, context78);
        codeGenerator33.addList(node40, false, context78);
        codeGenerator20.addList(node30, true, context78);
        codeGenerator1.addList(node17, false, context78);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertNotNull(codeGenerator43);
        org.junit.Assert.assertNotNull(codeGenerator54);
        org.junit.Assert.assertNotNull(codeGenerator62);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\"/hi!/\"" + "'", str68, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "\"//\"" + "'", str72, "\"//\"");
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"//\\\\\\\"hi!\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"///hi!///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///hi!///\"" + "'", str1, "\"///hi!///\"");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node13, true, context15);
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, false);
        java.lang.String str26 = codeGenerator21.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator21.addArrayList(node29);
        java.lang.String str32 = codeGenerator21.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator21.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, false);
        java.lang.String str43 = codeGenerator38.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator38.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator38.addArrayList(node46);
        java.lang.String str49 = codeGenerator38.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator38.addList(node50, true, context52);
        codeGenerator21.addList(node35, false, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node19, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\"//" + "'", str18, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"" + "'", str26, "\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"hi!\"" + "'", str32, "\"hi!\"");
        org.junit.Assert.assertNotNull(codeGenerator38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"hi!\"" + "'", str49, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"///hi!///\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"///hi!///\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"///hi!///\\\\\\\"\\\"\"");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        java.lang.String str15 = codeGenerator9.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        java.lang.String str19 = codeGenerator9.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node23, false, context25);
        codeGenerator1.addList(node6, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.lang.String str32 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/", charsetEncoder31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        java.lang.String str36 = codeGenerator1.escapeToDoubleQuotedJsString("\"////\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\"" + "'", str19, "\"//\"");
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str32, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\\\"////\\\"\"" + "'", str36, "\"\\\"////\\\"\"");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"///hi!///\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator9.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator9.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        java.lang.String str34 = codeGenerator28.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator28.addList(node35);
        java.lang.String str38 = codeGenerator28.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator28.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator28.addList(node42, false, context44);
        codeGenerator20.addList(node25, false, context44);
        codeGenerator9.addList(node17, false, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"/hi!/\"" + "'", str34, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"//\"" + "'", str38, "\"//\"");
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"////\"" + "'", str15, "\"////\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"" + "'", str19, "\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addAllSiblings(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator13.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator13.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator13.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addArrayList(node34);
        java.lang.String str37 = codeGenerator31.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator31.addList(node38);
        java.lang.String str41 = codeGenerator31.escapeToDoubleQuotedJsString("//");
        java.lang.String str43 = codeGenerator31.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node44, true, context46);
        codeGenerator13.addList(node28, true, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str23, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"/hi!/\"" + "'", str37, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"//\"" + "'", str41, "\"//\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str43, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        java.lang.Class<?> wildcardClass12 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.String str12 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        java.lang.String str42 = codeGenerator36.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator36.addList(node43);
        java.lang.String str46 = codeGenerator36.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator36.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator36.addList(node50, false, context52);
        codeGenerator28.addList(node33, false, context52);
        codeGenerator17.addList(node25, false, context52);
        codeGenerator1.addList(node14, true, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str11, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"/hi!/\"" + "'", str42, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"//\"" + "'", str46, "\"//\"");
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"///hi!///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str5 = codeGenerator1.regexpEscape("/hi!/");
        java.lang.String str7 = codeGenerator1.regexpEscape("/\"hi!\"/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        java.lang.String str18 = codeGenerator13.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator13.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, false);
        java.lang.String str32 = codeGenerator27.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator27.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addArrayList(node51);
        java.lang.String str54 = codeGenerator48.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator48.addList(node55);
        java.lang.String str58 = codeGenerator48.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator48.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator48.addList(node62, false, context64);
        codeGenerator40.addList(node45, false, context64);
        codeGenerator27.addList(node37, true, context64);
        codeGenerator13.addList(node24, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/hi!/" + "'", str3, "/hi!/");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//hi!//" + "'", str5, "//hi!//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "//\"hi!\"//" + "'", str7, "//\"hi!\"//");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator27);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"" + "'", str32, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator40);
        org.junit.Assert.assertNotNull(codeGenerator48);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"/hi!/\"" + "'", str54, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"//\"" + "'", str58, "\"//\"");
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator1.regexpEscape("//hi!//", charsetEncoder22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder25);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "///hi!///" + "'", str23, "///hi!///");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str26, "/\"///\\\"//\\\"///\"/");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node28, true, context30);
        java.lang.String str33 = codeGenerator1.escapeToDoubleQuotedJsString("\"////\\\"\\\\\\\"/hi!/\\\\\\\"\\\"////\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\\\"////\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"////\\\"\"" + "'", str33, "\"\\\"////\\\\\\\"\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"\\\\\\\"////\\\"\"");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        java.lang.String str20 = codeGenerator15.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator15.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        java.lang.String str42 = codeGenerator36.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator36.addList(node43);
        java.lang.String str46 = codeGenerator36.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator36.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator36.addList(node50, false, context52);
        codeGenerator28.addList(node33, false, context52);
        codeGenerator15.addList(node25, true, context52);
        codeGenerator1.addList(node12, true, context52);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator1.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator1.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node61, context62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"/hi!/\"" + "'", str42, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\"//\"" + "'", str46, "\"//\"");
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("hi!", charsetEncoder8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/hi!/" + "'", str9, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\"/" + "'", str11, "/\"\"/");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addList(node27, true);
        java.lang.String str31 = codeGenerator1.regexpEscape("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//");
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addAllSiblings(node40);
        java.nio.charset.CharsetEncoder charsetEncoder43 = null;
        java.lang.String str44 = codeGenerator34.regexpEscape("/\"\\\"/hi!/\\\"\"/", charsetEncoder43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator34.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator34.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addArrayList(node55);
        java.lang.String str58 = codeGenerator52.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator52.addList(node59);
        java.lang.String str62 = codeGenerator52.escapeToDoubleQuotedJsString("//");
        java.lang.String str64 = codeGenerator52.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator52.addList(node65, true, context67);
        codeGenerator34.addList(node49, true, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node32, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "///\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"///" + "'", str31, "///\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"///");
        org.junit.Assert.assertNotNull(codeGenerator34);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "//\"\\\"/hi!/\\\"\"//" + "'", str44, "//\"\\\"/hi!/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"/hi!/\"" + "'", str58, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"//\"" + "'", str62, "\"//\"");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str64, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/hi!/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        java.lang.String str19 = codeGenerator1.regexpEscape("////\"//\\\"hi!\\\"//\"////");
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addArrayList(node22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"////\"" + "'", str15, "\"////\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/////\"//\\\"hi!\\\"//\"/////" + "'", str19, "/////\"//\\\"hi!\\\"//\"/////");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/\\\\\\\"\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("///\"//\"///", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder26);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str15, "/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "////\"//\"////" + "'", str18, "////\"//\"////");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "///\"//\"///" + "'", str27, "///\"//\"///");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"//\\\"hi!\\\"//\"/");
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"//\"//", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str10, "//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"//\"///" + "'", str13, "///\"//\"///");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        java.lang.String str17 = codeGenerator12.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator12.addArrayList(node20);
        java.lang.String str23 = codeGenerator12.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator12.addList(node24, true, context26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node28, true, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"hi!\"" + "'", str23, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"hi!\"/" + "'", str1, "/\"hi!\"/");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
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
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str23, "\"//\\\"//\\\"//\"");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.regexpEscape("\"//\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"//\"/" + "'", str10, "/\"//\"/");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addArrayList(node19);
        java.lang.String str22 = codeGenerator16.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23);
        java.lang.String str26 = codeGenerator16.escapeToDoubleQuotedJsString("//");
        java.lang.String str28 = codeGenerator16.escapeToDoubleQuotedJsString("\"//\\\"\\\"//\"");
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator16.addList(node29, true, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"/hi!/\"" + "'", str7, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"//\"" + "'", str11, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"/hi!/\"" + "'", str22, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"//\"" + "'", str26, "\"//\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"" + "'", str28, "\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        boolean boolean1 = com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\"///hi!///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("////");
        java.lang.String str12 = codeGenerator1.regexpEscape("///\"//\\\"hi!\\\"//\"///");
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"////\"" + "'", str10, "\"////\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "////\"//\\\"hi!\\\"//\"////" + "'", str12, "////\"//\\\"hi!\\\"//\"////");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        java.lang.String str6 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"//\\\"\\\"//\"" + "'", str10, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"//\\\"\\\"//\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node14, true, context16);
        java.lang.Class<?> wildcardClass18 = context16.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }
}

