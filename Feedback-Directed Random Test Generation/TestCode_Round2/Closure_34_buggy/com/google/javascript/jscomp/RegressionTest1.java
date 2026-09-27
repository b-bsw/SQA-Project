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
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
        java.lang.Class<?> wildcardClass24 = builder21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//////\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
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
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node18, true, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"hi!\\\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str2, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setTagAsStrict(true);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator20.addList(node29, false, context31);
        codeGenerator2.addList(node16, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str1, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator18.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node31, false, context33);
        codeGenerator2.addList(node14, true, context33);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36, false);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"\\\"/\"/" + "'", str1, "/\"/\\\"\\\"/\"/");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, true, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node13, true, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, false, context37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node48, false, context50);
        codeGenerator30.addList(node39, false, context50);
        codeGenerator21.addList(node26, true, context50);
        codeGenerator2.addList(node17, false, context50);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addList(node55, false);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMapDetailLevel(detailLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node19, false, context21);
        codeGenerator9.addList(node10, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node6, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node13, true, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator22.addList(node27, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"////  ////\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"////  ////\\\"/\"/" + "'", str1, "/\"/\\\"////  ////\\\"/\"/");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"////  ////\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"////  ////\"//" + "'", str1, "//\"////  ////\"//");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"////" + "'", str1, "////\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"////");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//////\"/" + "'", str1, "/\"//////\"/");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator18.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node31, false, context33);
        codeGenerator2.addList(node14, true, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"\\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        codeGenerator2.addList(node10, true);
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder9.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node20, false, context22);
        codeGenerator2.addList(node11, false, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"hi!\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setOutputCharset(charset6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(false);
        java.lang.Class<?> wildcardClass12 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////\"hi!\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////\"hi!\"/////" + "'", str1, "/////\"hi!\"/////");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        codeGenerator2.addList(node48, false);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator55.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node61, true, context63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator74.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node79, false, context81);
        codeGenerator69.addList(node70, true, context81);
        codeGenerator55.addList(node65, false, context81);
        codeGenerator2.addList(node51, false, context81);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//////////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//////////\"" + "'", str1, "\"//////////\"");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/////\"hi!\"/////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//////\"hi!\"//////" + "'", str2, "//////\"hi!\"//////");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"  \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"  \"//" + "'", str1, "//\"  \"//");
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//////////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder5.setSourceMapDetailLevel(detailLevel18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        codeGenerator9.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator9.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator9.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator9.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator27.addList(node35, false, context37);
        codeGenerator9.addList(node23, true, context37);
        codeGenerator2.addList(node5, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node50, true, context52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addList(node59, false);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator58.addList(node62, true, context64);
        codeGenerator45.addList(node54, true, context64);
        codeGenerator2.addList(node41, true, context64);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineLengthThreshold((-1));
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, true, context9);
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
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator22.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator22.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator22.addAllSiblings(node34);
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
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator40.addList(node48, false, context50);
        codeGenerator22.addList(node36, true, context50);
        codeGenerator15.addList(node18, true, context50);
        codeGenerator2.addList(node11, false, context50);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        codeGenerator2.addAllSiblings(node35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addAllSiblings(node10);
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
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
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(false);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setOutputCharset(charset16);
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, true, context8);
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
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        java.lang.Class<?> wildcardClass18 = builder17.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//" + "'", str2, "//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/hi!/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"  \"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator16.addList(node17, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator39.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator39.addList(node50, true, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36, context52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
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
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        codeGenerator2.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"hi!\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"  \"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"  \"//" + "'", str1, "//\"  \"//");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/////  /////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        java.lang.Class<?> wildcardClass14 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder5.build();
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
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
        codeGenerator2.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/\\\"////  ////\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"" + "'", str1, "\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"////  ////\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"////  ////\\\"//\"" + "'", str1, "\"//\\\"////  ////\\\"//\"");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"///\\\"////  ////\\\"///\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/  /\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        codeGenerator2.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"hi!\\\"//\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//\\\"hi!\\\"//\"//" + "'", str2, "//\"//\\\"hi!\\\"//\"//");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder19.setSourceMapDetailLevel(detailLevel24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
            codeGenerator2.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node53, false, context55);
        codeGenerator35.addList(node44, false, context55);
        codeGenerator26.addList(node31, true, context55);
        codeGenerator2.addList(node22, false, context55);
        java.lang.Class<?> wildcardClass60 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold((int) '#');
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node19, true, context21);
        codeGenerator2.addList(node13, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//////////\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//////\"hi!\"//////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//////\"hi!\"//////" + "'", str1, "//////\"hi!\"//////");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        java.lang.Class<?> wildcardClass24 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder17.setLineBreak(false);
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
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass18 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMap(sourceMap6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator38.addList(node43, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node35, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) 'a');
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node19, true, context21);
        codeGenerator2.addList(node13, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node4, true, context6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator12.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator12.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node29, true, context31);
        codeGenerator12.addList(node23, false, context31);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator12.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator12.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node53, false, context55);
        codeGenerator43.addList(node44, true, context55);
        codeGenerator12.addList(node39, false, context55);
        codeGenerator1.addList(node8, true, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"/  /\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\"///" + "'", str1, "///\"\"///");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
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
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator14.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator30.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node43, false, context45);
        codeGenerator14.addList(node26, true, context45);
        codeGenerator2.addList(node10, false, context45);
        java.lang.Class<?> wildcardClass49 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(true);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold(500);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node26, true, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        codeGenerator2.addList(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator7.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node28, false, context30);
        codeGenerator7.addList(node15, false, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node4, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"//\\\"hi!\\\"//\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("////\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"////" + "'", str1, "////\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"////");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        java.lang.Class<?> wildcardClass14 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        codeGenerator14.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator14.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator14.addList(node23, false, context25);
        codeGenerator2.addList(node10, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/hi!/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setPrettyPrint(false);
        java.lang.Class<?> wildcardClass18 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
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
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str1, "/\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, true, context9);
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
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator22.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator22.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator22.addAllSiblings(node34);
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
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator40.addList(node48, false, context50);
        codeGenerator22.addList(node36, true, context50);
        codeGenerator15.addList(node18, true, context50);
        codeGenerator2.addList(node11, false, context50);
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"\\\\\\\"\\\"//\"");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
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
        codeGenerator2.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//hi!//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node38, true, context40);
        codeGenerator21.addList(node32, false, context40);
        codeGenerator2.addList(node17, true, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setLineLengthThreshold((int) '#');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
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
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        java.lang.Class<?> wildcardClass8 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder5.build();
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node13, true, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node35, false, context37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator43.addList(node48, false, context50);
        codeGenerator30.addList(node39, false, context50);
        codeGenerator21.addList(node26, true, context50);
        codeGenerator2.addList(node17, false, context50);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator2.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator60.addList(node65, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node57, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        codeGenerator2.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"\\\"\\\"\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node37, false, context39);
        codeGenerator27.addList(node28, true, context39);
        codeGenerator13.addList(node23, false, context39);
        codeGenerator2.addList(node9, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//////\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"////  ////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"////  ////\"/" + "'", str1, "/\"////  ////\"/");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setOutputTypes(false);
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
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold(0);
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) (short) 10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node53, false, context55);
        codeGenerator35.addList(node44, false, context55);
        codeGenerator26.addList(node31, true, context55);
        codeGenerator2.addList(node22, false, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//  //");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((int) '4');
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator9.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator23.addList(node26, true, context28);
        codeGenerator9.addList(node20, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator9.addList(node31, false);
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
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        java.nio.charset.Charset charset65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64, charset65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addAllSiblings(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator66.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator66.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addAllSiblings(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator79.addList(node82);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context86 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator79.addList(node84, false, context86);
        codeGenerator66.addList(node75, false, context86);
        codeGenerator57.addList(node62, true, context86);
        codeGenerator38.addList(node53, false, context86);
        codeGenerator9.addList(node34, false, context86);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context86 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context86.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) '#');
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
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        codeGenerator2.addList(node10, true, context43);
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"hi!\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"hi!\\\"/\"/" + "'", str2, "/\"/\\\"hi!\\\"/\"/");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//\\\"////  ////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"////  ////\\\"//\"" + "'", str1, "\"//\\\"////  ////\\\"//\"");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setSourceMapDetailLevel(detailLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23, context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator16.addList(node17, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPreferLineBreakAtEndOfFile(true);
        java.lang.Class<?> wildcardClass16 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"////  ////\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"////  ////\"/" + "'", str2, "/\"////  ////\"/");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"/" + "'", str1, "/\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMapDetailLevel(detailLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputTypes(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setSourceMapDetailLevel(detailLevel24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
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
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node19, true, context21);
        codeGenerator2.addList(node13, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator44.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator57.addList(node62, false, context64);
        codeGenerator44.addList(node53, false, context64);
        codeGenerator35.addList(node40, true, context64);
        codeGenerator16.addList(node31, false, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"////  ////\\\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//\\\"////  ////\\\"//\"/" + "'", str2, "/\"//\\\"////  ////\\\"//\"/");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node20, true, context22);
        java.lang.Class<?> wildcardClass24 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMapDetailLevel(detailLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        codeGenerator2.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node37, true, context39);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator28.addList(node37, false, context39);
        codeGenerator16.addList(node24, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator15.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        java.lang.Class<?> wildcardClass15 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"////  ////\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"////  ////\"//" + "'", str2, "//\"////  ////\"//");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"/  /\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator12.addList(node17, true, context19);
        codeGenerator2.addList(node9, true, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"  \\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputCharset(charset10);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        java.lang.Class<?> wildcardClass5 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator24.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator36.addList(node44, false, context46);
        codeGenerator24.addList(node32, true, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21, context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
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
        codeGenerator1.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"hi!\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"hi!\\\"/\"/" + "'", str1, "/\"/\\\"hi!\\\"/\"/");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        codeGenerator2.addAllSiblings(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMap(sourceMap22);
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
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"//" + "'", str2, "//\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"//");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"/" + "'", str1, "/\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"/");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"hi!\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"hi!\\\"/\"//" + "'", str1, "//\"/\\\"hi!\\\"/\"//");
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
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator39.addList(node44, false, context46);
        codeGenerator26.addList(node35, false, context46);
        codeGenerator17.addList(node22, true, context46);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator17.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator56.addList(node60, true, context62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        java.nio.charset.Charset charset67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66, charset67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator68.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator68.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator68.addList(node73, false);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator68.addList(node76, false, context78);
        codeGenerator56.addList(node64, true, context78);
        codeGenerator17.addList(node52, true, context78);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputCharset(charset18);
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"  \\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"  \\\"/\"/" + "'", str1, "/\"/\\\"  \\\"/\"/");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
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
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        codeGenerator2.addList(node9);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"/  /\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///\"hi!\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"////  ////\\\"//\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//\\\"////  ////\\\"//\"//" + "'", str2, "//\"//\\\"////  ////\\\"//\"//");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//hi!//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//hi!//\"/" + "'", str2, "/\"//hi!//\"/");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 0);
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
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
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/////\"////  ////\"/////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setOutputCharset(charset18);
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setSourceMap(sourceMap12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//////\\\"/\"" + "'", str1, "\"/\\\"//////\\\"/\"");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(true);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//////\"hi!\"//////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator13.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node37, false, context39);
        codeGenerator27.addList(node28, true, context39);
        codeGenerator13.addList(node23, false, context39);
        codeGenerator2.addList(node9, false, context39);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//////////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////////////" + "'", str2, "////////////");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        codeGenerator2.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"  \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"//////\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setTagAsStrict(false);
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
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        codeGenerator2.addList(node11, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
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
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        codeGenerator2.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"\\\"\\\\\\\"\\\\\\\"\\\"\"///" + "'", str1, "///\"\\\"\\\\\\\"\\\\\\\"\\\"\"///");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold(100);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setSourceMap(sourceMap18);
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
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) (short) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/" + "'", str1, "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(false);
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        codeGenerator2.addAllSiblings(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setLineLengthThreshold((-1));
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator19.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator33.addList(node38, true, context40);
        codeGenerator19.addList(node30, true, context40);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator60.addList(node65, false, context67);
        codeGenerator47.addList(node56, false, context67);
        codeGenerator19.addList(node43, true, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputCharset(charset20);
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
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node38, true, context40);
        codeGenerator21.addList(node32, false, context40);
        codeGenerator2.addList(node17, true, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineLengthThreshold((int) (short) 100);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node27, true, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold(500);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setOutputCharset(charset6);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator22.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator37.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator37.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator51.addList(node56, true, context58);
        codeGenerator37.addList(node48, true, context58);
        codeGenerator22.addList(node33, true, context58);
        codeGenerator9.addList(node18, false, context58);
        codeGenerator2.addList(node5, false, context58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputCharset(charset12);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setSourceMapDetailLevel(detailLevel14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator21.addList(node26, true, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19, context28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        codeGenerator2.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator53.addList(node58, false);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator53.addList(node61, false, context63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator53.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator53.addList(node67, true);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator74.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator74.addArrayList(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator74.addList(node79, false);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator74.addList(node82, true);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator74.addList(node85, true, context87);
        codeGenerator53.addList(node70, true, context87);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node50, context87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setPreferLineBreakAtEndOfFile(true);
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        codeGenerator2.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"////  ////\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//\\\"////  ////\\\"//\"//" + "'", str1, "//\"//\\\"////  ////\\\"//\"//");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"\\\"\\\\\\\"\\\\\\\"\\\"\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold(10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = builder23.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\"\"//");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        java.lang.Class<?> wildcardClass10 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = builder11.build();
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
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(false);
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (byte) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputTypes(true);
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
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        codeGenerator8.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator8.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator8.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator8.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator8.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator8.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator8.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node27, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node5, context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"////  ////\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node28, true, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
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
        codeGenerator2.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator31.addList(node36, false, context38);
        codeGenerator23.addList(node27, false, context38);
        codeGenerator2.addList(node19, false, context38);
        java.lang.Class<?> wildcardClass42 = context38.getClass();
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///\"hi!\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineLengthThreshold(1);
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
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        java.lang.Class<?> wildcardClass12 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"\\\"\\\\\\\"\\\\\\\"\\\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////" + "'", str1, "////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        codeGenerator7.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator7.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator7.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node24, true, context26);
        codeGenerator7.addList(node18, false, context26);
        codeGenerator2.addList(node3, false, context26);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, false);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder15.setPrettyPrint(true);
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
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        java.lang.Class<?> wildcardClass6 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"///" + "'", str1, "///\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"///");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder15.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setOutputTypes(true);
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//" + "'", str1, "//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        codeGenerator2.addArrayList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        java.lang.Class<?> wildcardClass8 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/" + "'", str1, "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"////  ////\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder13.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        codeGenerator2.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\\\"hi!\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"hi!\\\"//\"/" + "'", str1, "/\"//\\\"hi!\\\"//\"/");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator9.addList(node14, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//hi!//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//hi!//\"//" + "'", str1, "//\"//hi!//\"//");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//////\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//////\"//" + "'", str2, "//\"//////\"//");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(true);
        java.lang.Class<?> wildcardClass14 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPreferLineBreakAtEndOfFile(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder3.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"////  ////\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        java.lang.Class<?> wildcardClass16 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 0);
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//////////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator26.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node32, true, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node50, false, context52);
        codeGenerator40.addList(node41, true, context52);
        codeGenerator26.addList(node36, false, context52);
        codeGenerator2.addList(node22, true, context52);
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node4, true, context6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator12.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator12.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator26.addList(node29, true, context31);
        codeGenerator12.addList(node23, false, context31);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator12.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator12.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node53, false, context55);
        codeGenerator43.addList(node44, true, context55);
        codeGenerator12.addList(node39, false, context55);
        codeGenerator1.addList(node8, true, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator30.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator30.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator44.addList(node49, true, context51);
        codeGenerator30.addList(node41, true, context51);
        codeGenerator15.addList(node26, true, context51);
        codeGenerator2.addList(node11, false, context51);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addList(node56);
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        codeGenerator2.addList(node48, false);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator2.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator2.addList(node53);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node38, true, context40);
        codeGenerator21.addList(node32, false, context40);
        codeGenerator2.addList(node17, true, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = builder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/////\"////  ////\"/////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/////\\\"////  ////\\\"/////\"" + "'", str1, "\"/////\\\"////  ////\\\"/////\"");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"///\\\"////  ////\\\"///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"////  ////\\\"///\"" + "'", str1, "\"///\\\"////  ////\\\"///\"");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        codeGenerator2.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"\\\"\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        codeGenerator2.addList(node24, false);
        java.lang.Class<?> wildcardClass27 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addList(node50, true);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator44.addList(node53, false, context55);
        codeGenerator32.addList(node40, false, context55);
        codeGenerator2.addList(node28, false, context55);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator2.addList(node61);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"  \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"  \\\"\"" + "'", str1, "\"\\\"  \\\"\"");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//////\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//////\"/" + "'", str1, "/\"//////\"/");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        java.lang.Class<?> wildcardClass10 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node6, true, context8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//\\\"hi!\\\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        codeGenerator2.addAllSiblings(node11);
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/  /\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/  /\"//" + "'", str1, "//\"/  /\"//");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setSourceMapDetailLevel(detailLevel12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"  \\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"  \\\"/\"//" + "'", str1, "//\"/\\\"  \\\"/\"//");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/  /\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"//");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"//hi!//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///" + "'", str1, "///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        codeGenerator2.addList(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        codeGenerator2.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator2.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineBreak(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = builder17.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator16.addList(node17, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
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
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = null;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator18.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addList(node26, false);
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
        codeGenerator18.addList(node29, true, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator16.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node29, false, context31);
        codeGenerator1.addList(node12, false, context31);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        codeGenerator2.addList(node30, false);
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
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//" + "'", str2, "//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (byte) 0);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setPrettyPrint(true);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setSourceMapDetailLevel(detailLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        codeGenerator10.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator10.addList(node15, false, context17);
        codeGenerator2.addList(node6, false, context17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator2.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setLineBreak(false);
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass16 = builder13.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//hi!//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        codeGenerator2.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMapDetailLevel(detailLevel8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//\\\"////  ////\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"  \\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//////\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//////\"/" + "'", str2, "/\"//////\"/");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"" + "'", str1, "\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator16.addList(node17, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator36.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator51.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator51.addList(node59, false, context61);
        codeGenerator36.addList(node47, true, context61);
        codeGenerator2.addList(node32, true, context61);
        java.lang.Class<?> wildcardClass65 = context61.getClass();
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"  \\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"/" + "'", str1, "/\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder17.setOutputTypes(false);
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) -1);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setSourceMapDetailLevel(detailLevel20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        java.lang.Class<?> wildcardClass27 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setSourceMapDetailLevel(detailLevel6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"\\\"\\\\\\\"\\\\\\\"\\\"\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"///\"" + "'", str1, "\"///\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"///\"");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"/\\\"\\\"/\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMapDetailLevel(detailLevel10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(100);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(true);
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
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) (short) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = builder15.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
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
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setSourceMap(sourceMap12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(false);
        java.lang.Class<?> wildcardClass18 = builder17.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMapDetailLevel(detailLevel16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"//hi!//\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"//hi!//\\\"//\"" + "'", str1, "\"//\\\"//hi!//\\\"//\"");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        codeGenerator2.addList(node24, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass12 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator9.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator9.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator30.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator30.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator44.addList(node47, true, context49);
        codeGenerator30.addList(node41, false, context49);
        codeGenerator9.addList(node26, true, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node6, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        codeGenerator2.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
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
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator26.addList(node31, true, context33);
        codeGenerator16.addList(node23, true, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/  /\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/  /\"/" + "'", str1, "/\"/  /\"/");
    }
}

