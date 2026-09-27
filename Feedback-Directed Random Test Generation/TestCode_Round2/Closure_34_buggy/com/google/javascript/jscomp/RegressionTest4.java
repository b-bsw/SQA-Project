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
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        codeGenerator2.addList(node13, true, context27);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder17.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder17.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder17.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator17.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator17.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator38.addList(node46, true);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator38.addList(node49, true, context51);
        codeGenerator17.addList(node34, true, context51);
        codeGenerator2.addList(node13, true, context51);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"/\\\"  \\\"/\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node8, true, context10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"//" + "'", str1, "//\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"//");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node8, true, context10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node28, false, context30);
        codeGenerator2.addList(node16, true, context30);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/  /\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator15.addList(node19, true, context21);
        codeGenerator2.addList(node11, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setOutputCharset(charset12);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setSourceMap(sourceMap14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"//" + "'", str2, "//\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"//");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node31, true, context33);
        codeGenerator24.addList(node25, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator40.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator40.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator40.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator40.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node53, false, context55);
        codeGenerator24.addList(node36, true, context55);
        codeGenerator2.addList(node20, true, context55);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputCharset(charset22);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder21.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator6.addList(node9, true, context11);
        codeGenerator2.addList(node3, false, context11);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator31.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator31.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator31.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator46.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator60.addList(node65, true, context67);
        codeGenerator46.addList(node57, true, context67);
        codeGenerator31.addList(node42, true, context67);
        codeGenerator17.addList(node27, false, context67);
        codeGenerator2.addList(node13, false, context67);
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder7.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator7.addList(node12, false, context14);
        codeGenerator2.addList(node3, true, context14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator22.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator22.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator22.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node41, false, context43);
        codeGenerator2.addList(node18, true, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator14.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator14.addList(node22, false, context24);
        codeGenerator2.addList(node10, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addList(node29, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"///\\\"\\\"///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator32.addList(node37, true, context39);
        codeGenerator22.addList(node29, true, context39);
        codeGenerator2.addList(node18, true, context39);
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator23.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator23.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator23.addList(node34, true, context36);
        codeGenerator2.addList(node19, true, context36);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator2.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        codeGenerator2.addList(node43, false, context45);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator15.addList(node19, true, context21);
        codeGenerator2.addList(node11, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator34.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator34.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator34.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator34.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator34.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator34.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator34.addList(node54, false, context56);
        codeGenerator2.addList(node30, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator63.addList(node68, false);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator63.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator63.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator63.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator63.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator63.addList(node81, true, context83);
        codeGenerator2.addList(node59, false, context83);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) -1);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator23.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node41, false, context43);
        codeGenerator23.addList(node32, false, context43);
        codeGenerator14.addList(node19, true, context43);
        codeGenerator2.addList(node10, false, context43);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator2.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator56.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator56.addAllSiblings(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator56.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator56.addList(node73, false);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        java.nio.charset.Charset charset79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78, charset79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        java.nio.charset.Charset charset84 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator85 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83, charset84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator85.addAllSiblings(node86);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator85.addList(node88);
        com.google.javascript.rhino.Node node90 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context92 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator85.addList(node90, false, context92);
        codeGenerator80.addList(node81, true, context92);
        codeGenerator56.addList(node76, true, context92);
        codeGenerator2.addList(node52, false, context92);
        com.google.javascript.rhino.Node node97 = null;
        codeGenerator2.addArrayList(node97);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context92 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context92.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node29, false, context31);
        codeGenerator11.addList(node20, false, context31);
        codeGenerator2.addList(node7, true, context31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator2.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator2.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45, false);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
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
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator17.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node36, true, context38);
        codeGenerator17.addList(node28, true, context38);
        codeGenerator2.addList(node13, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMap(sourceMap18);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node10, false, context12);
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
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator7.addList(node12, false, context14);
        codeGenerator2.addList(node3, true, context14);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder11.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder11.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder11.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, false);
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\\\"hi!\\\"\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"\\\"hi!\\\"\"///" + "'", str2, "///\"\\\"hi!\\\"\"///");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"///\\\"  \\\"///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"///\\\\\\\"  \\\\\\\"///\\\"\"" + "'", str1, "\"\\\"///\\\\\\\"  \\\\\\\"///\\\"\"");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node8, true, context10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator17.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator17.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node34, true, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"////  ////\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"////  ////\"///" + "'", str1, "///\"////  ////\"///");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addArrayList(node24);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 100);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator14.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator14.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator29.addList(node37, false, context39);
        codeGenerator14.addList(node25, true, context39);
        codeGenerator2.addList(node10, false, context39);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addList(node43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"\\\"hi!\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
    }
}

