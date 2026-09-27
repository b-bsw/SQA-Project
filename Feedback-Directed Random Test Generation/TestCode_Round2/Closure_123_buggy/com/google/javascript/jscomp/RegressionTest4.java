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
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("", charsetEncoder13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"hi!\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addArrayList(node22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str11, "\"///\\\"//\\\"///\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "//" + "'", str14, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"hi!\"/" + "'", str16, "/\"hi!\"/");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"", charsetEncoder10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\"", charsetEncoder13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"//\\\"//\\\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"/" + "'", str11, "/\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\"/" + "'", str14, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"//\\\"//\\\"//\"/" + "'", str16, "/\"//\\\"//\\\"//\"/");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.lang.String str16 = codeGenerator1.regexpEscape("//\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"//");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        java.lang.String str24 = codeGenerator20.regexpEscape("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator35.addList(node38, true, context40);
        java.lang.String str43 = codeGenerator35.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator35.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator51.addList(node54, true, context56);
        java.lang.String str59 = codeGenerator51.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator51.addList(node60, false, context62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator73.addList(node76, true, context78);
        codeGenerator67.addList(node70, false, context78);
        codeGenerator51.addList(node64, true, context78);
        codeGenerator35.addList(node48, true, context78);
        codeGenerator20.addList(node32, true, context78);
        codeGenerator1.addList(node17, false, context78);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "///\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"///" + "'", str16, "///\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"///");
        org.junit.Assert.assertNotNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "//" + "'", str24, "//");
        org.junit.Assert.assertNotNull(codeGenerator35);
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"\"" + "'", str43, "\"\"");
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(codeGenerator51);
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\"" + "'", str59, "\"\"");
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(codeGenerator67);
        org.junit.Assert.assertNotNull(codeGenerator73);
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"\"", charsetEncoder13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"\\\"hi!\\\"\"/");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        java.lang.String str22 = codeGenerator1.regexpEscape("/\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"/");
        java.lang.Class<?> wildcardClass23 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"\"/" + "'", str14, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/" + "'", str16, "/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"\\\"hi!\\\"\"//" + "'", str18, "//\"\\\"hi!\\\"\"//");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"//" + "'", str22, "//\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"//");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//\"///");
        java.lang.String str13 = codeGenerator1.regexpEscape("\"///\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"///\"");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str11, "\"///\\\"//\\\"///\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"///\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"///\"/" + "'", str13, "/\"///\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"" + "'", str17, "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str7, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str9, "\"/\\\"//\\\"/\"");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer10);
        java.lang.String str13 = codeGenerator11.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator11.regexpEscape("\"hi!\"", charsetEncoder18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer24);
        java.lang.String str27 = codeGenerator25.regexpEscape("");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addAllSiblings(node30);
        java.lang.String str33 = codeGenerator25.escapeToDoubleQuotedJsString("/\"//\"/");
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator37.addList(node40, true, context42);
        java.lang.String str45 = codeGenerator37.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator37.addList(node46, false, context48);
        codeGenerator25.addList(node34, true, context48);
        codeGenerator11.addList(node22, false, context48);
        java.lang.String str53 = codeGenerator11.escapeToDoubleQuotedJsString("/\"//\\\"\\\\\\\"//\\\\\\\"\\\"//\"/");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator11.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator11.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer60);
        java.lang.String str63 = codeGenerator61.regexpEscape("");
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addArrayList(node64);
        java.lang.String str67 = codeGenerator61.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator61.addAllSiblings(node68);
        java.lang.String str71 = codeGenerator61.escapeToDoubleQuotedJsString("\"///\\\"//\\\"///\"");
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator61.addList(node72, false, context74);
        codeGenerator11.addList(node58, true, context74);
        codeGenerator1.addList(node8, false, context74);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertNotNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"hi!\"/" + "'", str19, "/\"hi!\"/");
        org.junit.Assert.assertNotNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "//" + "'", str27, "//");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str33, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"\"" + "'", str45, "\"\"");
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str53, "\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "//" + "'", str63, "//");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"//\\\"\\\"//\"" + "'", str67, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str71, "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"/");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"///\\\"\\\"///\"");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        java.lang.String str27 = codeGenerator23.regexpEscape("");
        java.lang.String str29 = codeGenerator23.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder31 = null;
        java.lang.String str32 = codeGenerator23.regexpEscape("/\"\"/", charsetEncoder31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        java.lang.String str43 = codeGenerator39.regexpEscape("");
        java.lang.String str45 = codeGenerator39.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder47 = null;
        java.lang.String str48 = codeGenerator39.regexpEscape("", charsetEncoder47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator39.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator61.addList(node64, true, context66);
        codeGenerator55.addList(node58, false, context66);
        codeGenerator39.addList(node52, false, context66);
        codeGenerator23.addList(node36, false, context66);
        codeGenerator1.addList(node20, false, context66);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator1.addList(node72, true);
        com.google.javascript.rhino.Node node75 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str15, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"///\\\"\\\"///\"/" + "'", str17, "/\"///\\\"\\\"///\"/");
        org.junit.Assert.assertNotNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "//" + "'", str27, "//");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/\"//\"/" + "'", str29, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "//\"\"//" + "'", str32, "//\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "//" + "'", str43, "//");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/\"//\"/" + "'", str45, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "//" + "'", str48, "//");
        org.junit.Assert.assertNotNull(codeGenerator55);
        org.junit.Assert.assertNotNull(codeGenerator61);
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        java.lang.String str18 = codeGenerator1.escapeToDoubleQuotedJsString("//////\"//\"//////");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addAllSiblings(node19);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str14, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"//////\\\"//\\\"//////\"" + "'", str18, "\"//////\\\"//\\\"//////\"");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("\"\"", charsetEncoder9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"", charsetEncoder12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator17.regexpEscape("");
        java.lang.String str23 = codeGenerator17.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator17.regexpEscape("", charsetEncoder25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator39.addList(node42, true, context44);
        codeGenerator33.addList(node36, false, context44);
        codeGenerator17.addList(node30, false, context44);
        codeGenerator1.addList(node14, true, context44);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator1.addArrayList(node52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"\"/" + "'", str10, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str13, "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//" + "'", str21, "//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/\"//\"/" + "'", str23, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//" + "'", str26, "//");
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertNotNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("///\"\\\"hi!\\\"\"///");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//" + "'", str17, "//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"///\\\"\\\\\\\"hi!\\\\\\\"\\\"///\"" + "'", str23, "\"///\\\"\\\\\\\"hi!\\\\\\\"\\\"///\"");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node12, false, context14);
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\\\"//\\\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"/\\\"//\\\\\\\"//\\\\\\\"//\\\"/\"" + "'", str19, "\"/\\\"//\\\\\\\"//\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        java.lang.String str13 = codeGenerator9.regexpEscape("");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator9.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator23.addList(node24, false, context26);
        codeGenerator9.addList(node20, true, context26);
        codeGenerator1.addList(node6, false, context26);
        java.lang.String str31 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//" + "'", str13, "//");
        org.junit.Assert.assertNotNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str31, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//" + "'", str17, "//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("\"///\\\"//\\\"///\"");
        java.lang.String str11 = codeGenerator1.regexpEscape("//\"\"//");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str9, "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///\"\"///" + "'", str11, "///\"\"///");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str14, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\"\"" + "'", str16, "\"\\\"\\\"\"");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node10, false, context12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        java.lang.String str19 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/" + "'", str19, "/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("\"///\\\"//\\\"///\"");
        java.lang.String str11 = codeGenerator1.regexpEscape("//\"\"//");
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("///\"\"///");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22);
        java.lang.String str25 = codeGenerator19.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node26, false, context28);
        codeGenerator1.addList(node16, false, context28);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str9, "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///\"\"///" + "'", str11, "///\"\"///");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"///\\\"\\\"///\"" + "'", str13, "\"///\\\"\\\"///\"");
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"hi!\"" + "'", str25, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addAllSiblings(node14);
        java.lang.String str17 = codeGenerator13.regexpEscape("");
        java.lang.String str19 = codeGenerator13.regexpEscape("\"//\"");
        java.lang.String str21 = codeGenerator13.escapeToDoubleQuotedJsString("\"///\\\"//\\\"///\"");
        java.lang.String str23 = codeGenerator13.escapeToDoubleQuotedJsString("/\"///\\\"//\\\"///\"/");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addAllSiblings(node28);
        java.lang.String str31 = codeGenerator27.regexpEscape("");
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addAllSiblings(node34);
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.lang.String str38 = codeGenerator27.regexpEscape("\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"", charsetEncoder37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator48.addList(node51, true, context53);
        codeGenerator42.addList(node45, false, context53);
        codeGenerator27.addList(node39, false, context53);
        codeGenerator13.addList(node24, true, context53);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//" + "'", str17, "//");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"//\"/" + "'", str19, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str21, "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"" + "'", str23, "\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "//" + "'", str31, "//");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/" + "'", str38, "/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator42);
        org.junit.Assert.assertNotNull(codeGenerator48);
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node8, false, context10);
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"//\\\"\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"//\"///" + "'", str13, "///\"//\"///");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        java.lang.String str21 = codeGenerator1.regexpEscape("//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//");
        java.nio.charset.CharsetEncoder charsetEncoder23 = null;
        java.lang.String str24 = codeGenerator1.regexpEscape("//////", charsetEncoder23);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//" + "'", str17, "//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "///\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"///" + "'", str21, "///\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"///");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "////////" + "'", str24, "////////");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("\"hi!\"");
        java.lang.String str7 = codeGenerator1.regexpEscape("//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"", charsetEncoder11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str5, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "////" + "'", str7, "////");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "/\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"/" + "'", str12, "/\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("hi!", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        java.lang.String str11 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        java.nio.charset.CharsetEncoder charsetEncoder15 = null;
        java.lang.String str16 = codeGenerator1.regexpEscape("/\"\\\"\\\"\"/", charsetEncoder15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/hi!/" + "'", str6, "/hi!/");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "//" + "'", str11, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//\"\\\"\\\"\"//" + "'", str16, "//\"\\\"\\\"\"//");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        java.lang.String str20 = codeGenerator14.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator14.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addAllSiblings(node23);
        java.nio.charset.CharsetEncoder charsetEncoder26 = null;
        java.lang.String str27 = codeGenerator14.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder26);
        java.lang.String str29 = codeGenerator14.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36);
        java.lang.String str39 = codeGenerator33.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator33.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator33.addAllSiblings(node42);
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.lang.String str46 = codeGenerator33.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder45);
        java.lang.String str48 = codeGenerator33.escapeToDoubleQuotedJsString("\"//\"");
        java.lang.String str50 = codeGenerator33.regexpEscape("\"///\\\"//\\\"///\"");
        java.lang.String str52 = codeGenerator33.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/");
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addAllSiblings(node57);
        java.lang.String str60 = codeGenerator56.regexpEscape("");
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator56.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer67);
        java.lang.String str70 = codeGenerator68.regexpEscape("");
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator68.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator68.addAllSiblings(node73);
        java.lang.String str76 = codeGenerator68.escapeToDoubleQuotedJsString("/\"//\"/");
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator80.addAllSiblings(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator80.addList(node83, true, context85);
        java.lang.String str88 = codeGenerator80.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator80.addList(node89, false, context91);
        codeGenerator68.addList(node77, true, context91);
        codeGenerator56.addList(node65, true, context91);
        codeGenerator33.addList(node53, true, context91);
        codeGenerator14.addList(node30, false, context91);
        codeGenerator1.addList(node11, true, context91);
        java.lang.String str99 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"" + "'", str10, "\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str27, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"//\\\"\"" + "'", str29, "\"\\\"//\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"hi!\"" + "'", str39, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str46, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"\\\"//\\\"\"" + "'", str48, "\"\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str50, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str52, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator56);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "//" + "'", str60, "//");
        org.junit.Assert.assertNotNull(codeGenerator68);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "//" + "'", str70, "//");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str76, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator80);
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "\"\"" + "'", str88, "\"\"");
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str99, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("//\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"//", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/hi!/\"" + "'", str15, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "///\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"///" + "'", str18, "///\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"///");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("\"hi!\"", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        java.lang.String str20 = codeGenerator14.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator14.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator14.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34);
        java.lang.String str37 = codeGenerator31.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node38, false, context40);
        codeGenerator14.addList(node28, false, context40);
        codeGenerator1.addList(node11, true, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, false);
        java.lang.Class<?> wildcardClass47 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"hi!\"/" + "'", str10, "/\"hi!\"/");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertNotNull(codeGenerator31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"hi!\"" + "'", str37, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str9 = codeGenerator1.regexpEscape("//");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "////" + "'", str9, "////");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"" + "'", str11, "\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("////////////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node6, true, context8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//\"///");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"//\\\"\\\"//\"");
        java.lang.String str17 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str11, "\"///\\\"//\\\"///\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"//\\\"\\\"//\"/" + "'", str15, "/\"//\\\"\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str17, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        java.nio.charset.CharsetEncoder charsetEncoder8 = null;
        java.lang.String str9 = codeGenerator1.regexpEscape("\"hi!\"", charsetEncoder8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        java.lang.String str13 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"\\\"\"//");
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"//\\\"//\\\"//\"/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/\"hi!\"/" + "'", str9, "/\"hi!\"/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"" + "'", str13, "\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"//\\\"//\\\"//\"//" + "'", str15, "//\"//\\\"//\\\"//\"//");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("\"hi!\"");
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("////\"//\"////", charsetEncoder17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//" + "'", str10, "//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str15, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/////\"//\"/////" + "'", str18, "/////\"//\"/////");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("hi!", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = null;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        java.nio.charset.CharsetEncoder charsetEncoder14 = null;
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"\\\"\\\"\"/", charsetEncoder14);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/hi!/" + "'", str6, "/hi!/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"\\\"\\\"\"//" + "'", str15, "//\"\\\"\\\"\"//");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        java.lang.String str16 = codeGenerator14.regexpEscape("");
        java.lang.String str18 = codeGenerator14.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node19, true, context21);
        codeGenerator1.addList(node11, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        java.lang.String str35 = codeGenerator31.regexpEscape("");
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator31.addList(node38);
        java.lang.String str41 = codeGenerator31.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator31.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addList(node50);
        java.lang.String str53 = codeGenerator47.escapeToDoubleQuotedJsString("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder55 = null;
        java.lang.String str56 = codeGenerator47.regexpEscape("\"\"", charsetEncoder55);
        java.nio.charset.CharsetEncoder charsetEncoder58 = null;
        java.lang.String str59 = codeGenerator47.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"", charsetEncoder58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator47.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator47.addList(node63, true, context65);
        codeGenerator31.addList(node44, true, context65);
        codeGenerator1.addList(node28, false, context65);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"/" + "'", str10, "/\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "//" + "'", str16, "//");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "//" + "'", str35, "//");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"/hi!/\"" + "'", str41, "\"/hi!/\"");
        org.junit.Assert.assertNotNull(codeGenerator47);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\"hi!\"" + "'", str53, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "/\"\"/" + "'", str56, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str59, "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str1, "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        java.lang.String str13 = codeGenerator1.regexpEscape("\"\\\"//\\\"\"");
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("///\"\"///");
        java.lang.String str17 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"\\\"//\\\"\"/" + "'", str13, "/\"\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"///\\\"\\\"///\"" + "'", str15, "\"///\\\"\\\"///\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "//" + "'", str17, "//");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("///\"//\"///");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("", charsetEncoder13);
        java.lang.String str16 = codeGenerator1.regexpEscape("\"hi!\"");
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str11, "\"///\\\"//\\\"///\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "//" + "'", str14, "//");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/\"hi!\"/" + "'", str16, "/\"hi!\"/");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"" + "'", str1, "\"/\\\"///\\\\\\\"//\\\\\\\"///\\\"/\"");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.lang.String str11 = codeGenerator1.escapeToDoubleQuotedJsString("/hi!/");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"/hi!/\"" + "'", str11, "\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node19, true, context21);
        codeGenerator1.addList(node13, false, context21);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator1.regexpEscape("/\"\"/", charsetEncoder25);
        java.lang.String str28 = codeGenerator1.escapeToDoubleQuotedJsString("///\"\\\"\\\"\"///");
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator32.addList(node35, true, context37);
        java.lang.String str40 = codeGenerator32.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addList(node41);
        java.nio.charset.CharsetEncoder charsetEncoder44 = null;
        java.lang.String str45 = codeGenerator32.regexpEscape("\"\"", charsetEncoder44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addAllSiblings(node50);
        java.lang.String str53 = codeGenerator49.regexpEscape("");
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator49.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator49.addAllSiblings(node56);
        java.nio.charset.CharsetEncoder charsetEncoder59 = null;
        java.lang.String str60 = codeGenerator49.regexpEscape("\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"", charsetEncoder59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator70.addList(node73, true, context75);
        codeGenerator64.addList(node67, false, context75);
        codeGenerator49.addList(node61, false, context75);
        codeGenerator32.addList(node46, true, context75);
        codeGenerator1.addList(node29, false, context75);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//" + "'", str10, "//");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//\"\"//" + "'", str26, "//\"\"//");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"///\\\"\\\\\\\"\\\\\\\"\\\"///\"" + "'", str28, "\"///\\\"\\\\\\\"\\\\\\\"\\\"///\"");
        org.junit.Assert.assertNotNull(codeGenerator32);
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"\"" + "'", str40, "\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "/\"\"/" + "'", str45, "/\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "//" + "'", str53, "//");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/" + "'", str60, "/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator64);
        org.junit.Assert.assertNotNull(codeGenerator70);
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("/\"/hi!/\"/", charsetEncoder11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "//\"/hi!/\"//" + "'", str12, "//\"/hi!/\"//");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"" + "'", str15, "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("//\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"//", charsetEncoder13);
        java.nio.charset.CharsetEncoder charsetEncoder16 = null;
        java.lang.String str17 = codeGenerator1.regexpEscape("//\"////\"//", charsetEncoder16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "///\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"///" + "'", str14, "///\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"///");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "///\"////\"///" + "'", str17, "///\"////\"///");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//\"//\"//");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("/\"//\"/");
        java.nio.charset.CharsetEncoder charsetEncoder11 = null;
        java.lang.String str12 = codeGenerator1.regexpEscape("///\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"///", charsetEncoder11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\\\"//\\\"//\"" + "'", str7, "\"//\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str9, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "////\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"////" + "'", str12, "////\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"////");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("\"///\\\"\\\"///\"", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.String str10 = codeGenerator1.escapeToDoubleQuotedJsString("///\"\"///");
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/\"///\\\"\\\"///\"/" + "'", str6, "/\"///\\\"\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"///\\\"\\\"///\"" + "'", str10, "\"///\\\"\\\"///\"");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        java.lang.String str26 = codeGenerator22.regexpEscape("");
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator22.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator36.addList(node37, false, context39);
        codeGenerator22.addList(node33, true, context39);
        codeGenerator14.addList(node19, false, context39);
        codeGenerator1.addList(node11, true, context39);
        java.nio.charset.CharsetEncoder charsetEncoder45 = null;
        java.lang.String str46 = codeGenerator1.regexpEscape("//////\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"//////", charsetEncoder45);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "//" + "'", str26, "//");
        org.junit.Assert.assertNotNull(codeGenerator36);
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "///////\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"///////" + "'", str46, "///////\"\\\"//\\\\\\\"//\\\\\\\"//\\\"\"///////");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node19, true, context21);
        codeGenerator1.addList(node13, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addAllSiblings(node24);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//" + "'", str10, "//");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str9 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("", charsetEncoder9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("\"//\\\"////\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"////\\\"//\"", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("////\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"////");
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("/\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"/", charsetEncoder17);
        java.nio.charset.CharsetEncoder charsetEncoder20 = null;
        java.lang.String str21 = codeGenerator1.regexpEscape("/////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"/////", charsetEncoder20);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//" + "'", str10, "//");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/\"//\\\"////\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"////\\\"//\"/" + "'", str13, "/\"//\\\"////\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"////\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/////\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/////" + "'", str15, "/////\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/////");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "//\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"//" + "'", str18, "//\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"//////" + "'", str21, "//////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"//////");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        java.lang.String str20 = codeGenerator14.escapeToDoubleQuotedJsString("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator14.regexpEscape("\"\"", charsetEncoder22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator14.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"", charsetEncoder25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node33, true, context35);
        java.lang.String str38 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node39, false, context41);
        codeGenerator14.addList(node27, true, context41);
        codeGenerator1.addList(node11, true, context41);
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\"" + "'", str7, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/\"\"/" + "'", str23, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str26, "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node4, true, context6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        java.lang.String str21 = codeGenerator19.regexpEscape("");
        java.lang.String str23 = codeGenerator19.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator19.addList(node24, true, context26);
        java.lang.String str29 = codeGenerator19.escapeToDoubleQuotedJsString("///\"//\"///");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator19.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator19.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator37.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator37.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = null;
        codeGenerator37.addList(node46, true, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator53.addList(node56, true, context58);
        codeGenerator37.addList(node50, false, context58);
        codeGenerator19.addList(node34, true, context58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "//" + "'", str21, "//");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"///\\\"//\\\"///\"" + "'", str29, "\"///\\\"//\\\"///\"");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator53);
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("\"///\\\"//\\\"///\"");
        java.lang.String str11 = codeGenerator1.regexpEscape("//\"\"//");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"\\\\\\\"\\\"/\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        java.lang.String str23 = codeGenerator21.regexpEscape("");
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addArrayList(node24);
        java.lang.String str27 = codeGenerator21.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addAllSiblings(node38);
        java.lang.String str41 = codeGenerator37.regexpEscape("");
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator37.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator37.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator37.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        java.lang.String str57 = codeGenerator53.regexpEscape("");
        java.lang.String str59 = codeGenerator53.regexpEscape("\"//\"");
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addAllSiblings(node64);
        java.lang.String str67 = codeGenerator63.regexpEscape("");
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator63.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator63.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator63.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator77.addList(node78, false, context80);
        codeGenerator63.addList(node74, true, context80);
        codeGenerator53.addList(node60, true, context80);
        codeGenerator37.addList(node50, false, context80);
        codeGenerator21.addList(node34, true, context80);
        codeGenerator1.addList(node18, true, context80);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/\\\\\\\"//\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str9, "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///\"\"///" + "'", str11, "///\"\"///");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str15, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "//" + "'", str23, "//");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"//\\\"\\\"//\"" + "'", str27, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "//" + "'", str41, "//");
        org.junit.Assert.assertNotNull(codeGenerator53);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "//" + "'", str57, "//");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "/\"//\"/" + "'", str59, "/\"//\"/");
        org.junit.Assert.assertNotNull(codeGenerator63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "//" + "'", str67, "//");
        org.junit.Assert.assertNotNull(codeGenerator77);
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("////////");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"///\\\"\\\"///\"");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        java.lang.String str27 = codeGenerator21.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator21.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addList(node41);
        java.lang.String str44 = codeGenerator38.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator38.addList(node45, false, context47);
        codeGenerator21.addList(node35, false, context47);
        codeGenerator1.addList(node18, true, context47);
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"////////\"" + "'", str15, "\"////////\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"///\\\"\\\"///\"/" + "'", str17, "/\"///\\\"\\\"///\"/");
        org.junit.Assert.assertNotNull(codeGenerator21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"hi!\"" + "'", str27, "\"hi!\"");
        org.junit.Assert.assertNotNull(codeGenerator38);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"hi!\"" + "'", str44, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"///" + "'", str1, "///\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"///");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node31, true, context33);
        codeGenerator17.addList(node25, true, context33);
        codeGenerator1.addList(node14, false, context33);
        java.nio.charset.CharsetEncoder charsetEncoder38 = null;
        java.lang.String str39 = codeGenerator1.regexpEscape("///\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"///", charsetEncoder38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator1.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = null;
        codeGenerator1.addList(node42, false, context44);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/" + "'", str11, "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertNotNull(codeGenerator28);
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "////\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"////" + "'", str39, "////\"\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"\"////");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("/\"\"/", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        java.lang.String str19 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//\"\"//" + "'", str10, "//\"\"//");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"" + "'", str19, "\"//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//\"");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18);
        java.lang.String str21 = codeGenerator15.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addAllSiblings(node24);
        java.nio.charset.CharsetEncoder charsetEncoder27 = null;
        java.lang.String str28 = codeGenerator15.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder27);
        java.lang.String str30 = codeGenerator15.escapeToDoubleQuotedJsString("\"//\"");
        java.lang.String str32 = codeGenerator15.regexpEscape("\"///\\\"//\\\"///\"");
        java.lang.String str34 = codeGenerator15.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/");
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addAllSiblings(node39);
        java.lang.String str42 = codeGenerator38.regexpEscape("");
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator38.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer49);
        java.lang.String str52 = codeGenerator50.regexpEscape("");
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator50.addAllSiblings(node55);
        java.lang.String str58 = codeGenerator50.escapeToDoubleQuotedJsString("/\"//\"/");
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator62.addList(node65, true, context67);
        java.lang.String str70 = codeGenerator62.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator62.addList(node71, false, context73);
        codeGenerator50.addList(node59, true, context73);
        codeGenerator38.addList(node47, true, context73);
        codeGenerator15.addList(node35, true, context73);
        codeGenerator1.addList(node12, false, context73);
        com.google.javascript.rhino.Node node79 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertNotNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"hi!\"" + "'", str21, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str28, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\\\"//\\\"\"" + "'", str30, "\"\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str32, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str34, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "//" + "'", str42, "//");
        org.junit.Assert.assertNotNull(codeGenerator50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "//" + "'", str52, "//");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"/\\\"//\\\"/\"" + "'", str58, "\"/\\\"//\\\"/\"");
        org.junit.Assert.assertNotNull(codeGenerator62);
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "\"\"" + "'", str70, "\"\"");
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("/\"//\"/", charsetEncoder7);
        java.nio.charset.CharsetEncoder charsetEncoder10 = null;
        java.lang.String str11 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "//\"//\"//" + "'", str8, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str11, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node8, false, context10);
        java.lang.String str13 = codeGenerator1.regexpEscape("//\"//\"//");
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        java.nio.charset.CharsetEncoder charsetEncoder17 = null;
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"", charsetEncoder17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25);
        java.lang.String str28 = codeGenerator22.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str30 = codeGenerator22.regexpEscape("");
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator22.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator22.addArrayList(node34);
        java.nio.charset.CharsetEncoder charsetEncoder37 = null;
        java.lang.String str38 = codeGenerator22.regexpEscape("/\"//\"/", charsetEncoder37);
        java.lang.String str40 = codeGenerator22.escapeToDoubleQuotedJsString("//\"\"//");
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node47, true, context49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator44.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = null;
        codeGenerator44.addList(node53, true, context55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator60.addList(node63, true, context65);
        codeGenerator44.addList(node57, false, context65);
        codeGenerator22.addList(node41, true, context65);
        codeGenerator1.addList(node19, false, context65);
        java.lang.Class<?> wildcardClass70 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "///\"//\"///" + "'", str13, "///\"//\"///");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/" + "'", str18, "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
        org.junit.Assert.assertNotNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"" + "'", str28, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "//" + "'", str30, "//");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "//\"//\"//" + "'", str38, "//\"//\"//");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\"//\\\"\\\"//\"" + "'", str40, "\"//\\\"\\\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator44);
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(codeGenerator60);
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder9 = null;
        java.lang.String str10 = codeGenerator1.regexpEscape("", charsetEncoder9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node19, true, context21);
        codeGenerator1.addList(node13, false, context21);
        java.lang.String str25 = codeGenerator1.escapeToDoubleQuotedJsString("//\"////\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"////\"//");
        java.lang.String str27 = codeGenerator1.regexpEscape("\"/hi!/\"");
        java.lang.String str29 = codeGenerator1.regexpEscape("//\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"//");
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "//" + "'", str10, "//");
        org.junit.Assert.assertNotNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"//\\\"////\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"////\\\"//\"" + "'", str25, "\"//\\\"////\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "/\"/hi!/\"/" + "'", str27, "/\"/hi!/\"/");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "///\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"///" + "'", str29, "///\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"///");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("//");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        java.lang.String str20 = codeGenerator14.escapeToDoubleQuotedJsString("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder22 = null;
        java.lang.String str23 = codeGenerator14.regexpEscape("\"\"", charsetEncoder22);
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator14.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"", charsetEncoder25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node33, true, context35);
        java.lang.String str38 = codeGenerator30.escapeToDoubleQuotedJsString("");
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node39, false, context41);
        codeGenerator14.addList(node27, true, context41);
        codeGenerator1.addList(node11, true, context41);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addAllSiblings(node45);
        java.lang.String str48 = codeGenerator1.regexpEscape("/\"\\\"//\\\\\\\"////\\\\\\\"//\\\"\"/");
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addList(node49, false);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"//\"" + "'", str7, "\"//\"");
        org.junit.Assert.assertNotNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "/\"\"/" + "'", str23, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str26, "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "//\"\\\"//\\\\\\\"////\\\\\\\"//\\\"\"//" + "'", str48, "//\"\\\"//\\\\\\\"////\\\\\\\"//\\\"\"//");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"/");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"///\\\"\\\"///\"");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
        java.lang.String str24 = codeGenerator1.escapeToDoubleQuotedJsString("//\"////\"//");
        java.lang.String str26 = codeGenerator1.escapeToDoubleQuotedJsString("//\"\"//");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"/////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str15, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"///\\\"\\\"///\"/" + "'", str17, "/\"///\\\"\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"//\\\"////\\\"//\"" + "'", str24, "\"//\\\"////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"//\\\"\\\"//\"" + "'", str26, "\"//\\\"\\\"//\"");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"//" + "'", str1, "//\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator12.addList(node15, true, context17);
        codeGenerator1.addList(node9, true, context17);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
        java.lang.String str24 = codeGenerator1.regexpEscape("/\"////////\"/");
        java.lang.Class<?> wildcardClass25 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertNotNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "//\"////////\"//" + "'", str24, "//\"////////\"//");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.lang.String str5 = codeGenerator1.escapeToDoubleQuotedJsString("");
        java.nio.charset.CharsetEncoder charsetEncoder7 = null;
        java.lang.String str8 = codeGenerator1.regexpEscape("\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"", charsetEncoder7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.String str15 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"/\"/");
        java.lang.String str17 = codeGenerator1.regexpEscape("\"///\\\"\\\"///\"");
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
        java.lang.String str24 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator1.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/" + "'", str8, "/\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str15, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "/\"///\\\"\\\"///\"/" + "'", str17, "/\"///\\\"\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "//" + "'", str24, "//");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        java.lang.String str7 = codeGenerator1.regexpEscape("\"//\"");
        java.lang.String str9 = codeGenerator1.escapeToDoubleQuotedJsString("\"///\\\"//\\\"///\"");
        java.lang.String str11 = codeGenerator1.regexpEscape("//\"\"//");
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        java.lang.String str18 = codeGenerator1.regexpEscape("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addAllSiblings(node22);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/\"//\"/" + "'", str7, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"" + "'", str9, "\"\\\"///\\\\\\\"//\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "///\"\"///" + "'", str11, "///\"\"///");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str14, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/" + "'", str18, "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"////\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str9 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
        java.nio.charset.CharsetEncoder charsetEncoder18 = null;
        java.lang.String str19 = codeGenerator1.regexpEscape("\"\\\"\\\"\"", charsetEncoder18);
        java.nio.charset.CharsetEncoder charsetEncoder21 = null;
        java.lang.String str22 = codeGenerator1.regexpEscape("/\"\\\"//\\\"\"/", charsetEncoder21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = null;
        codeGenerator1.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addList(node27, false);
        java.lang.Class<?> wildcardClass30 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/\"\\\"\\\"\"/" + "'", str19, "/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "//\"\\\"//\\\"\"//" + "'", str22, "//\"\\\"//\\\"\"//");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        java.lang.String str3 = codeGenerator1.regexpEscape("");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = codeGenerator1.regexpEscape("hi!", charsetEncoder5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.nio.charset.CharsetEncoder charsetEncoder12 = null;
        java.lang.String str13 = codeGenerator1.regexpEscape("/\"\\\"\\\"\"/", charsetEncoder12);
        java.lang.String str15 = codeGenerator1.regexpEscape("\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        java.lang.String str19 = codeGenerator1.regexpEscape("///\"\\\"hi!\\\"\"///");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "//" + "'", str3, "//");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/hi!/" + "'", str6, "/hi!/");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "//\"\\\"\\\"\"//" + "'", str13, "//\"\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/" + "'", str15, "/\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "////\"\\\"hi!\\\"\"////" + "'", str19, "////\"\\\"hi!\\\"\"////");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        java.lang.String str9 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("", charsetEncoder13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        java.lang.String str23 = codeGenerator17.escapeToDoubleQuotedJsString("hi!");
        java.nio.charset.CharsetEncoder charsetEncoder25 = null;
        java.lang.String str26 = codeGenerator17.regexpEscape("\"\"", charsetEncoder25);
        java.nio.charset.CharsetEncoder charsetEncoder28 = null;
        java.lang.String str29 = codeGenerator17.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"", charsetEncoder28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        java.lang.String str37 = codeGenerator33.regexpEscape("");
        java.lang.String str39 = codeGenerator33.regexpEscape("\"//\"");
        java.nio.charset.CharsetEncoder charsetEncoder41 = null;
        java.lang.String str42 = codeGenerator33.regexpEscape("", charsetEncoder41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator33.addList(node43, true);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator55.addList(node58, true, context60);
        codeGenerator49.addList(node52, false, context60);
        codeGenerator33.addList(node46, false, context60);
        codeGenerator17.addList(node30, true, context60);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "//" + "'", str9, "//");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "//" + "'", str14, "//");
        org.junit.Assert.assertNotNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"hi!\"" + "'", str23, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "/\"\"/" + "'", str26, "/\"\"/");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str29, "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertNotNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "//" + "'", str37, "//");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "/\"//\"/" + "'", str39, "/\"//\"/");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "//" + "'", str42, "//");
        org.junit.Assert.assertNotNull(codeGenerator49);
        org.junit.Assert.assertNotNull(codeGenerator55);
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node10, false, context12);
        java.lang.String str15 = codeGenerator1.regexpEscape("/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        java.nio.charset.CharsetEncoder charsetEncoder19 = null;
        java.lang.String str20 = codeGenerator1.regexpEscape("/////\"//\"/////", charsetEncoder19);
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//" + "'", str15, "//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "//////\"//\"//////" + "'", str20, "//////\"//\"//////");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        java.lang.String str5 = codeGenerator1.regexpEscape("");
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator19.addList(node22, true, context24);
        codeGenerator13.addList(node16, false, context24);
        codeGenerator1.addList(node10, false, context24);
        java.lang.String str29 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"//\\\\\\\"\\\\\\\"//\\\"/\"/");
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator1.addList(node30, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "//" + "'", str5, "//");
        org.junit.Assert.assertNotNull(codeGenerator13);
        org.junit.Assert.assertNotNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"" + "'", str29, "\"/\\\"/\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = com.google.javascript.jscomp.CodeGenerator.forCostEstimation(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        java.lang.String str7 = codeGenerator1.escapeToDoubleQuotedJsString("hi!");
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        java.nio.charset.CharsetEncoder charsetEncoder13 = null;
        java.lang.String str14 = codeGenerator1.regexpEscape("\"///\\\"//\\\"///\"", charsetEncoder13);
        java.lang.String str16 = codeGenerator1.escapeToDoubleQuotedJsString("\"//\"");
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        java.lang.String str21 = codeGenerator1.escapeToDoubleQuotedJsString("/\"\\\"//\\\\\\\"\\\\\\\"//\\\"\"/");
        java.lang.String str23 = codeGenerator1.escapeToDoubleQuotedJsString("/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(codeGenerator1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/\"///\\\"//\\\"///\"/" + "'", str14, "/\"///\\\"//\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"//\\\"\"" + "'", str16, "\"\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str21, "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"" + "'", str23, "\"/\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"///\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"////" + "'", str1, "////\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"////");
    }
}

