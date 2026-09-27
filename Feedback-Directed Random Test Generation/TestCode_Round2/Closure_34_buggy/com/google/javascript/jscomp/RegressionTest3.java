package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        codeGenerator2.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/  /\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        codeGenerator2.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22, true);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//" + "'", str1, "//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        codeGenerator21.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator21.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator21.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator21.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator21.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator53.addList(node56, true, context58);
        codeGenerator39.addList(node50, false, context58);
        codeGenerator21.addList(node35, true, context58);
        codeGenerator2.addList(node17, false, context58);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addAllSiblings(node63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, true);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((int) (short) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        codeGenerator2.addAllSiblings(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setTagAsStrict(false);
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator30.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator51.addList(node56, false, context58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator64.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator64.addList(node69, false, context71);
        codeGenerator51.addList(node60, false, context71);
        codeGenerator42.addList(node47, true, context71);
        codeGenerator30.addList(node38, false, context71);
        codeGenerator2.addList(node26, false, context71);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node19, true, context21);
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
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder11.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder11.setPrettyPrint(false);
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.Class<?> wildcardClass21 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//\\\"hi!\\\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"////\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"////\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"////\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"////\\\"\"/" + "'", str1, "/\"\\\"////\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"////\\\"\"/");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"//\\\\\\\"//hi!//\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"//hi!//\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"//hi!//\\\\\\\"//\\\"\"");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setLineBreak(true);
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
        codeGenerator22.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node33, true, context35);
        codeGenerator2.addList(node18, true, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"//\\\"////  ////\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"//\\\"////  ////\\\"//\"///" + "'", str1, "///\"//\\\"////  ////\\\"//\"///");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator31.addList(node39, false, context41);
        codeGenerator19.addList(node27, true, context41);
        codeGenerator2.addList(node15, true, context41);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, true, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder3.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator10.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator10.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node36, false, context38);
        codeGenerator10.addList(node24, true, context38);
        codeGenerator1.addList(node6, true, context38);
        java.lang.Class<?> wildcardClass42 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
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
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        codeGenerator2.addList(node26, true, context50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addList(node54, true);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMapDetailLevel(detailLevel18);
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
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(false);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputCharset(charset12);
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
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        codeGenerator2.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addAllSiblings(node32);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        codeGenerator2.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////////////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
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
        codeGenerator13.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator13.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator31.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator31.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node48, true, context50);
        codeGenerator31.addList(node42, false, context50);
        codeGenerator13.addList(node27, true, context50);
        codeGenerator2.addList(node9, false, context50);
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"//\\\"////  ////\\\"//\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineLengthThreshold(500);
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
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/" + "'", str2, "/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator18.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        codeGenerator2.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder7.setOutputCharset(charset16);
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        codeGenerator2.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addArrayList(node54);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
        codeGenerator2.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator2.addArrayList(node47);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder5.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder5.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder5.setPreferLineBreakAtEndOfFile(false);
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/" + "'", str2, "/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        codeGenerator2.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator2.addList(node46, true);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"/\\\"//////\\\"/\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(false);
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
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMapDetailLevel(detailLevel14);
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        codeGenerator2.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addArrayList(node35);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        codeGenerator2.addList(node26, true, context50);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"//\\\"//hi!//\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        codeGenerator2.addList(node35, false);
        java.lang.Class<?> wildcardClass38 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        codeGenerator2.addAllSiblings(node37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(false);
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
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(false);
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
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 0);
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setSourceMapDetailLevel(detailLevel10);
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
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"////\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"////\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"////" + "'", str2, "////\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"////");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"////\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"////\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"  \\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        codeGenerator2.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addList(node59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setTagAsStrict(true);
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
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setSourceMap(sourceMap20);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPrettyPrint(false);
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
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        codeGenerator2.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(true);
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
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold(500);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"//\"/" + "'", str1, "/\"//\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"//\"/");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(false);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
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
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setOutputTypes(true);
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
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str1, "\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        codeGenerator2.addArrayList(node47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"\\\\\\\"/  /\\\\\\\"\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputTypes(true);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputCharset(charset16);
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
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        codeGenerator2.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node32, true, context34);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator12.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator40.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator40.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator40.addList(node48, false);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator54.addList(node59, true, context61);
        codeGenerator40.addList(node51, true, context61);
        codeGenerator25.addList(node36, true, context61);
        codeGenerator12.addList(node21, false, context61);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder5.build();
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
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
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
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap sourceMap12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setSourceMap(sourceMap12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"//" + "'", str1, "//\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setTagAsStrict(true);
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder21.setOutputCharset(charset26);
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
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputCharset(charset10);
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
            codeGenerator1.add("//\"//\\\"//hi!//\\\"//\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//////\\\"\"" + "'", str1, "\"\\\"//////\\\"\"");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
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
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////" + "'", str1, "////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        codeGenerator2.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator60.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator60.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator60.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator60.addList(node74, true);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator60.addArrayList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node79, false, context81);
        codeGenerator2.addList(node56, false, context81);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator2.addList(node84);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        codeGenerator2.addList(node13);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setLineLengthThreshold(0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        codeGenerator2.addList(node34, true);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputCharset(charset16);
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
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"////\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"////\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"////\"" + "'", str1, "\"////\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"////\"");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(false);
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
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator23.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator23.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator37.addList(node40, true, context42);
        codeGenerator23.addList(node34, false, context42);
        codeGenerator2.addList(node19, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator2.addList(node46);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        codeGenerator2.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addList(node59);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
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
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(false);
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
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        codeGenerator2.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
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
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator40.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator40.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator61.addList(node66, false);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator61.addList(node69, true);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator61.addList(node72, true, context74);
        codeGenerator40.addList(node57, true, context74);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node37, context74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator59.addList(node64, true, context66);
        codeGenerator2.addList(node55, true, context66);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator2.addArrayList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        java.nio.charset.Charset charset74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73, charset74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addArrayList(node78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator75.addList(node80, false);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator75.addList(node83, false, context85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator75.addAllSiblings(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator75.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator75.addAllSiblings(node91);
        com.google.javascript.rhino.Node node93 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context95 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator75.addList(node93, true, context95);
        codeGenerator2.addList(node71, false, context95);
        com.google.javascript.rhino.Node node98 = null;
        codeGenerator2.addList(node98);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context95 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context95.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator31.addList(node39, false, context41);
        codeGenerator16.addList(node27, true, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder13.setSourceMap(sourceMap20);
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
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        codeGenerator2.addArrayList(node18);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        codeGenerator2.addArrayList(node55);
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
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder29 = builder27.setLineBreak(false);
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
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator28.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator46.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node59, false, context61);
        codeGenerator28.addList(node42, true, context61);
        codeGenerator2.addList(node24, true, context61);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator2.addAllSiblings(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator2.addArrayList(node67);
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(true);
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
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 0);
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
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setLineLengthThreshold((int) ' ');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder3.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        codeGenerator2.addAllSiblings(node15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setOutputTypes(false);
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
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator10.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator10.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator10.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator28.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node41, false, context43);
        codeGenerator10.addList(node24, true, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/" + "'", str2, "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder11.setOutputCharset(charset18);
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
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(false);
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setOutputCharset(charset18);
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
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"///\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"///\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"  \"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(false);
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
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder5.setLineLengthThreshold(0);
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
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"\\\\\\\"\\\\\\\"\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold((int) (short) 0);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setSourceMap(sourceMap22);
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
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator20.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator20.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator41.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator41.addList(node52, true, context54);
        codeGenerator20.addList(node37, true, context54);
        codeGenerator2.addList(node16, false, context54);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setLineLengthThreshold(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = builder3.build();
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node22, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        codeGenerator2.addList(node22, false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node14, true, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node26, true, context28);
        codeGenerator9.addList(node18, true, context28);
        codeGenerator2.addList(node5, true, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"" + "'", str1, "\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\"");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"//\\\"hi!\\\"//\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setTagAsStrict(true);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputCharset(charset20);
        com.google.javascript.jscomp.SourceMap sourceMap22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setSourceMap(sourceMap22);
        java.lang.Class<?> wildcardClass24 = builder23.getClass();
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
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        java.lang.Class<?> wildcardClass12 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setPreferLineBreakAtEndOfFile(true);
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
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//////////\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//////////\"/" + "'", str2, "/\"//////////\"/");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder9.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineLengthThreshold((int) (byte) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setLineLengthThreshold(0);
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
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(false);
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setLineLengthThreshold((int) (short) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        java.lang.Class<?> wildcardClass8 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        codeGenerator9.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator9.addList(node14, true, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node26, true, context28);
        codeGenerator9.addList(node18, true, context28);
        codeGenerator2.addList(node5, true, context28);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setLineBreak(false);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setOutputCharset(charset16);
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
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        codeGenerator2.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator2.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineBreak(false);
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
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold(1);
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
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        codeGenerator2.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator2.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/  /\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/  /\\\"/\"" + "'", str1, "\"/\\\"/  /\\\"/\"");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"  \"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"  \"///" + "'", str2, "///\"  \"///");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setLineLengthThreshold(100);
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(true);
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
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setOutputTypes(false);
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
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//////  //////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//////  //////" + "'", str1, "//////  //////");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setSourceMapDetailLevel(detailLevel14);
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
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        codeGenerator2.addArrayList(node30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        codeGenerator2.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator2.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator2.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator2.addList(node58, true);
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        codeGenerator2.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addList(node45, true);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        codeGenerator2.addAllSiblings(node23);
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
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPreferLineBreakAtEndOfFile(true);
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
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
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
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder7.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder7.setLineLengthThreshold((int) (byte) 0);
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
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"  \\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        codeGenerator2.addList(node35);
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setLineLengthThreshold((int) (short) 1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setLineBreak(false);
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setLineLengthThreshold((int) (short) 0);
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
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator12.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator12.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator33.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator33.addList(node44, true, context46);
        codeGenerator12.addList(node29, true, context46);
        codeGenerator1.addList(node8, true, context46);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator1.addList(node50, true);
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setTagAsStrict(false);
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
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
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
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"//////\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"//////\\\"\"/" + "'", str1, "/\"\\\"//////\\\"\"/");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        codeGenerator2.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////\"hi!\"////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator29.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node46, true, context48);
        codeGenerator29.addList(node38, true, context48);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator29.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator29.addList(node53, false, context55);
        codeGenerator2.addList(node25, true, context55);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"" + "'", str1, "\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = builder9.build();
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
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"//\\\"//hi!//\\\"//\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"//\\\"//hi!//\\\"//\"///" + "'", str2, "///\"//\\\"//hi!//\\\"//\"///");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        codeGenerator2.addList(node15, false);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(true);
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
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
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator7.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node22, true, context24);
        codeGenerator7.addList(node16, false, context24);
        codeGenerator2.addList(node3, false, context24);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"\\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//" + "'", str2, "//\"\\\"\\\\\\\"\\\\\\\"\\\"\"//");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setLineBreak(true);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setOutputCharset(charset14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
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
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node17, true, context19);
        codeGenerator2.addList(node11, true, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setOutputCharset(charset12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        java.lang.Class<?> wildcardClass10 = builder1.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"//////\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"//////\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"//////\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"  \"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"  \"////" + "'", str1, "////\"  \"////");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        codeGenerator2.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold((int) '#');
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputCharset(charset12);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//////////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////////////" + "'", str1, "////////////");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"///" + "'", str2, "///\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"///");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator51.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator51.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator51.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator51.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator51.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        java.nio.charset.Charset charset77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76, charset77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator78.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator78.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        codeGenerator78.addList(node83);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator78.addArrayList(node85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer89 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator90 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator90.addAllSiblings(node91);
        com.google.javascript.rhino.Node node93 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context95 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator90.addList(node93, true, context95);
        codeGenerator78.addList(node87, true, context95);
        codeGenerator51.addList(node74, false, context95);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node48, context95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context95 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context95.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/////\\\\\\\"////  ////\\\\\\\"/////\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/////\\\\\\\"////  ////\\\\\\\"/////\\\"\"" + "'", str1, "\"\\\"/////\\\\\\\"////  ////\\\\\\\"/////\\\"\"");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
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
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        codeGenerator2.addList(node12, true);
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
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setTagAsStrict(true);
        java.lang.Class<?> wildcardClass10 = builder9.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"//////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//////\"" + "'", str1, "\"//////\"");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
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
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = builder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Cannot build without root node being specified");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator10.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator10.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node36, false, context38);
        codeGenerator10.addList(node24, true, context38);
        codeGenerator1.addList(node6, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator1.addArrayList(node47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(false);
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
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setOutputCharset(charset6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator2.addArrayList(node29);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setSourceMap(sourceMap8);
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
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(true);
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
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        codeGenerator2.addList(node24, true);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setTagAsStrict(true);
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
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setTagAsStrict(true);
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
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
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
        codeGenerator2.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator2.addList(node59, true);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder11.setPrettyPrint(false);
        java.lang.Class<?> wildcardClass26 = builder11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
            codeGenerator2.add("/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator52.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator52.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator52.addList(node60, false, context62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator52.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator52.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator73.addArrayList(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator73.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator73.addList(node81, true);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context86 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator73.addList(node84, true, context86);
        codeGenerator52.addList(node69, true, context86);
        codeGenerator2.addList(node48, true, context86);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addList(node90, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context86 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context86.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"/\\\"hi!\\\"/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"hi!\\\"/\"//" + "'", str1, "//\"/\\\"hi!\\\"/\"//");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        java.lang.Class<?> wildcardClass20 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (short) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setSourceMap(sourceMap10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMap(sourceMap14);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setOutputCharset(charset16);
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
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/" + "'", str2, "/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"  \\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
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
            codeGenerator2.add("/\"///\\\"////  ////\\\"///\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/////" + "'", str1, "/////\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"/////");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        java.lang.Class<?> wildcardClass12 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"/\\\\\\\"  \\\\\\\"/\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator34.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator34.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator34.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node51, true, context53);
        codeGenerator34.addList(node45, false, context53);
        codeGenerator16.addList(node30, true, context53);
        codeGenerator2.addList(node12, true, context53);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
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
        codeGenerator61.addList(node62, true, context73);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node58, context73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputCharset(charset20);
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
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"//\\\"////  ////\\\"//\"///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////\"//\\\"////  ////\\\"//\"////" + "'", str2, "////\"//\\\"////  ////\\\"//\"////");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"//hi!//\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//\\\"//hi!//\\\"//\"//" + "'", str1, "//\"//\\\"//hi!//\\\"//\"//");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
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
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addArrayList(node25);
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
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20, false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) '4');
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
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
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
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"////\\\"////  ////\\\"////\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"////\\\\\\\"////  ////\\\\\\\"////\\\"\"" + "'", str1, "\"\\\"////\\\\\\\"////  ////\\\\\\\"////\\\"\"");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        codeGenerator2.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator29.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node46, true, context48);
        codeGenerator29.addList(node38, true, context48);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator29.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator29.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator29.addList(node55, true, context57);
        codeGenerator2.addList(node25, true, context57);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        codeGenerator2.addList(node41, false);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineBreak(false);
        java.lang.Class<?> wildcardClass14 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(true);
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
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(false);
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
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
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
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node43, false, context45);
        codeGenerator33.addList(node34, true, context45);
        codeGenerator2.addList(node29, false, context45);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator2.addArrayList(node49);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"  \\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"  \\\"\"/" + "'", str2, "/\"\\\"  \\\"\"/");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder5.setOutputCharset(charset14);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setOutputCharset(charset16);
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
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator46.addList(node55, false, context57);
        codeGenerator34.addList(node42, false, context57);
        codeGenerator2.addList(node30, false, context57);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"//\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"//\"/" + "'", str1, "/\"//\\\"//\\\\\\\"////  ////\\\\\\\"//\\\"//\"/");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        codeGenerator2.addAllSiblings(node17);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node43, false, context45);
        codeGenerator33.addList(node34, true, context45);
        codeGenerator2.addList(node29, false, context45);
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPreferLineBreakAtEndOfFile(true);
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
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineBreak(false);
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
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputCharset(charset10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
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
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        java.nio.charset.Charset charset2 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setOutputCharset(charset2);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8, true);
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setTagAsStrict(false);
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
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"///\\\"////  ////\\\"///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"///\\\\\\\"////  ////\\\\\\\"///\\\"\"" + "'", str1, "\"\\\"///\\\\\\\"////  ////\\\\\\\"///\\\"\"");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/\\\"//////\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"//////\\\"/\"/" + "'", str1, "/\"/\\\"//////\\\"/\"/");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//////////\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//////////\"//" + "'", str2, "//\"//////////\"//");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node60, false, context62);
        codeGenerator50.addList(node51, true, context62);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator69.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator69.addList(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator69.addArrayList(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator69.addArrayList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer82 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator83 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator83.addAllSiblings(node84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator83.addList(node86, true, context88);
        codeGenerator69.addList(node80, false, context88);
        codeGenerator50.addList(node65, true, context88);
        codeGenerator2.addList(node46, false, context88);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setLineLengthThreshold((int) (byte) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        codeGenerator2.addAllSiblings(node15);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        java.lang.Class<?> wildcardClass12 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (byte) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
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
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19, true);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        codeGenerator2.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//////\"hi!\"//////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///////\"hi!\"///////" + "'", str2, "///////\"hi!\"///////");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node38, true, context40);
        codeGenerator31.addList(node32, false, context40);
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator59.addList(node62, true, context64);
        codeGenerator47.addList(node56, true, context64);
        codeGenerator31.addList(node43, true, context64);
        codeGenerator2.addList(node27, false, context64);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        codeGenerator2.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, true);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator15.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator15.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node28, false, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
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
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node63, false, context65);
        codeGenerator45.addList(node54, false, context65);
        codeGenerator36.addList(node41, true, context65);
        codeGenerator24.addList(node32, false, context65);
        codeGenerator2.addList(node20, true, context65);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"//" + "'", str2, "//\"\\\"\\\\\\\"/  /\\\\\\\"\\\"\"//");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
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
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"//" + "'", str1, "//\"/\\\"/\\\\\\\"\\\\\\\"/\\\"/\"//");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) -1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setLineLengthThreshold((int) (byte) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder15.setTagAsStrict(true);
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
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setLineLengthThreshold((int) (byte) 1);
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setSourceMap(sourceMap16);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setSourceMap(sourceMap18);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setOutputTypes(false);
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
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///\"/\\\"/\\\\\\\"////  ////\\\\\\\"/\\\"/\"///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold((int) (byte) 0);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(true);
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputTypes(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\\\\\"/\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"/\\\\\\\"\\\"/\"");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"///\\\"////  ////\\\"///\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"///\\\"////  ////\\\"///\"//" + "'", str1, "//\"///\\\"////  ////\\\"///\"//");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
            codeGenerator1.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
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
        codeGenerator2.addArrayList(node55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        codeGenerator2.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addArrayList(node43);
        java.lang.Class<?> wildcardClass45 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///hi!///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////hi!////" + "'", str2, "////hi!////");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        codeGenerator2.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        codeGenerator2.addAllSiblings(node32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"//\\\"////  ////\\\"//\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"//\\\"////  ////\\\"//\"///" + "'", str1, "///\"//\\\"////  ////\\\"//\"///");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
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
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"///\\\\\\\"////  ////\\\\\\\"///\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"///\\\\\\\\\\\\\\\"////  ////\\\\\\\\\\\\\\\"///\\\\\\\"\\\"\"");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineBreak(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold(1);
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setOutputCharset(charset16);
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
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator10.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator10.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node36, false, context38);
        codeGenerator10.addList(node24, true, context38);
        codeGenerator1.addList(node6, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//hi!//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//hi!//\\\"/\"" + "'", str1, "\"/\\\"//hi!//\\\"/\"");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        codeGenerator18.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addAllSiblings(node30);
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
        codeGenerator36.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node49, false, context51);
        codeGenerator18.addList(node32, true, context51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node65, true, context67);
        codeGenerator58.addList(node59, false, context67);
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
        codeGenerator74.addArrayList(node85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node87, false, context89);
        codeGenerator58.addList(node70, true, context89);
        codeGenerator18.addList(node54, true, context89);
        codeGenerator2.addList(node14, false, context89);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addArrayList(node94);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator2.addList(node96);
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        codeGenerator2.addList(node20);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator28.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator46.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator46.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node59, false, context61);
        codeGenerator28.addList(node42, true, context61);
        codeGenerator2.addList(node24, true, context61);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator2.addList(node65, true);
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
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
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"  \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setLineLengthThreshold(10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineBreak(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineLengthThreshold((int) '4');
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
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(true);
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"/  /\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"  \"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"  \\\"///\"" + "'", str1, "\"///\\\"  \\\"///\"");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//////////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputCharset(charset14);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node22, true, context24);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/\\\"\\\\\\\"hi!\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"" + "'", str1, "\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addList(node30, true);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node23, true, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder11.setLineLengthThreshold((-1));
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
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setOutputTypes(true);
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
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap16 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setSourceMap(sourceMap16);
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
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setPrettyPrint(true);
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputCharset(charset12);
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
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputTypes(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setOutputCharset(charset8);
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
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
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
        codeGenerator20.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator34.addList(node37, true, context39);
        codeGenerator20.addList(node31, false, context39);
        codeGenerator2.addList(node16, true, context39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node47, true, context49);
        codeGenerator2.addList(node43, false, context49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addArrayList(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator55.addList(node60, false, context62);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node52, context62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
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
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setOutputCharset(charset22);
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
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder19.setSourceMapDetailLevel(detailLevel22);
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
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineLengthThreshold((int) (short) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPreferLineBreakAtEndOfFile(true);
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
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        codeGenerator2.addArrayList(node16);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////\"\\\"\\\\\\\"\\\\\\\"\\\"\"////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/////\"\\\"\\\\\\\"\\\\\\\"\\\"\"/////" + "'", str2, "/////\"\\\"\\\\\\\"\\\\\\\"\\\"\"/////");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold((int) ' ');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder7.setOutputCharset(charset14);
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
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
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
        codeGenerator32.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator32.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addArrayList(node54);
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
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator73.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator73.addList(node78, false, context80);
        codeGenerator60.addList(node69, false, context80);
        codeGenerator51.addList(node56, true, context80);
        codeGenerator32.addList(node47, false, context80);
        codeGenerator2.addList(node28, true, context80);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(false);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setPreferLineBreakAtEndOfFile(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder9.setPrettyPrint(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder23.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder27 = builder25.setTagAsStrict(false);
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
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
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
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator19.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node25, true, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator19.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator19.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator41.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator41.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        java.nio.charset.Charset charset52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51, charset52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator53.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer73 = null;
        java.nio.charset.Charset charset74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer73, charset74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator75.addList(node80, false, context82);
        codeGenerator62.addList(node71, false, context82);
        codeGenerator53.addList(node58, true, context82);
        codeGenerator41.addList(node49, false, context82);
        codeGenerator19.addList(node37, true, context82);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMapDetailLevel(detailLevel14);
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
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) 'a');
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setTagAsStrict(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineLengthThreshold(0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setPrettyPrint(false);
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
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
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
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        codeGenerator2.addList(node19, false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        codeGenerator2.addList(node14, false);
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setOutputTypes(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder15.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder15.setPreferLineBreakAtEndOfFile(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = builder19.build();
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
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        java.nio.charset.Charset charset11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10, charset11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator12.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator12.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node39, false, context41);
        codeGenerator12.addList(node26, true, context41);
        codeGenerator2.addList(node8, false, context41);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator2.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node47, false, context49);
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setPrettyPrint(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setLineLengthThreshold((int) (byte) 100);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
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
        codeGenerator2.addList(node48, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"//////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"/\\\"/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/\\\"/\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//\"///\\\"////  ////\\\"///\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/////\"\\\"\\\\\\\"\\\\\\\"\\\"\"/////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setOutputCharset(charset6);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (short) 0);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPrettyPrint(false);
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
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
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
        codeGenerator2.addAllSiblings(node40);
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineLengthThreshold((int) (byte) -1);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setTagAsStrict(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
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
        codeGenerator2.addAllSiblings(node57);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node2, true, context4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator10.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator10.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node36, false, context38);
        codeGenerator10.addList(node24, true, context38);
        codeGenerator1.addList(node6, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator1.addList(node42, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"//////////\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        codeGenerator18.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addAllSiblings(node30);
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
        codeGenerator36.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator36.addList(node49, false, context51);
        codeGenerator18.addList(node32, true, context51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator62.addList(node65, true, context67);
        codeGenerator58.addList(node59, false, context67);
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
        codeGenerator74.addArrayList(node85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator74.addList(node87, false, context89);
        codeGenerator58.addList(node70, true, context89);
        codeGenerator18.addList(node54, true, context89);
        codeGenerator2.addList(node14, false, context89);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addAllSiblings(node94);
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setLineBreak(true);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
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
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder9.setOutputCharset(charset14);
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
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setLineBreak(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPrettyPrint(false);
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
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPrettyPrint(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setPrettyPrint(false);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.SourceMap.DetailLevel detailLevel14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMapDetailLevel(detailLevel14);
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
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(true);
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setOutputTypes(true);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setLineLengthThreshold(0);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder13.setPrettyPrint(false);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder13.setSourceMap(sourceMap18);
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
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node17, false, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator25.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator25.addList(node38, false, context40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator25.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        java.nio.charset.Charset charset57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56, charset57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node63, false, context65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        java.nio.charset.Charset charset70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69, charset70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator71.addList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context78 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator71.addList(node76, false, context78);
        codeGenerator58.addList(node67, false, context78);
        codeGenerator49.addList(node54, true, context78);
        codeGenerator25.addList(node45, false, context78);
        codeGenerator16.addList(node21, true, context78);
        codeGenerator2.addList(node13, true, context78);
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context78 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context78.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator54.addList(node60, true);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator54.addList(node63, false, context65);
        codeGenerator2.addList(node50, false, context65);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/  /\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder17.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder17.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setPreferLineBreakAtEndOfFile(false);
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
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"  \\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder3.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder3.setLineLengthThreshold((int) ' ');
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/hi!/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/hi!/\\\"\"/" + "'", str2, "/\"\\\"/hi!/\\\"\"/");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setLineLengthThreshold((-1));
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setLineLengthThreshold(1);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        com.google.javascript.jscomp.SourceMap sourceMap10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setSourceMap(sourceMap10);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineLengthThreshold((int) '#');
        com.google.javascript.jscomp.CodePrinter.Builder builder25 = builder21.setOutputTypes(true);
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
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setOutputCharset(charset4);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setOutputCharset(charset8);
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder9.setOutputCharset(charset10);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder11.setSourceMap(sourceMap14);
        com.google.javascript.jscomp.CodePrinter.Builder builder17 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap18 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder19 = builder11.setSourceMap(sourceMap18);
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
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setTagAsStrict(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineLengthThreshold((int) (short) 1);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setLineLengthThreshold((int) (short) 10);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder1.setTagAsStrict(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder1.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder5.setOutputTypes(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator29.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator29.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator43.addList(node48, true, context50);
        codeGenerator29.addList(node40, true, context50);
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
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator70.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node75, false, context77);
        codeGenerator57.addList(node66, false, context77);
        codeGenerator29.addList(node53, true, context77);
        codeGenerator2.addList(node25, true, context77);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
            codeGenerator2.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        codeGenerator20.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator20.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator20.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator20.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator34.addList(node37, true, context39);
        codeGenerator20.addList(node31, false, context39);
        codeGenerator2.addList(node16, true, context39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node47, true, context49);
        codeGenerator2.addList(node43, false, context49);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node52, context53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        com.google.javascript.rhino.Node node15 = null;
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator30.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator30.addList(node39, false, context41);
        codeGenerator18.addList(node26, false, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder1.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder7.setLineBreak(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder7.setLineLengthThreshold(500);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder7.setPreferLineBreakAtEndOfFile(false);
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setLineBreak(true);
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
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setLineLengthThreshold(1);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setPrettyPrint(false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node38, true, context40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        java.nio.charset.Charset charset45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44, charset45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator46.addList(node50, true, context52);
        codeGenerator33.addList(node42, true, context52);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator33.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator33.addList(node57, false, context59);
        codeGenerator2.addList(node29, true, context59);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        java.nio.charset.Charset charset64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63, charset64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        java.nio.charset.Charset charset69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68, charset69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator70.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator70.addList(node75, false, context77);
        codeGenerator65.addList(node66, true, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node62, context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder1 = new com.google.javascript.jscomp.CodePrinter.Builder(node0);
        com.google.javascript.jscomp.CodePrinter.Builder builder3 = builder1.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder5 = builder3.setTagAsStrict(false);
        com.google.javascript.jscomp.SourceMap sourceMap6 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder7 = builder5.setSourceMap(sourceMap6);
        com.google.javascript.jscomp.SourceMap sourceMap8 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder9 = builder5.setSourceMap(sourceMap8);
        com.google.javascript.jscomp.CodePrinter.Builder builder11 = builder5.setOutputTypes(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder13 = builder11.setTagAsStrict(true);
        com.google.javascript.jscomp.SourceMap sourceMap14 = null;
        com.google.javascript.jscomp.CodePrinter.Builder builder15 = builder13.setSourceMap(sourceMap14);
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
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
        codeGenerator2.addArrayList(node26);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        com.google.javascript.jscomp.CodePrinter.Builder builder21 = builder19.setPreferLineBreakAtEndOfFile(true);
        com.google.javascript.jscomp.CodePrinter.Builder builder23 = builder21.setLineBreak(false);
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        codeGenerator20.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator20.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node33, false, context35);
        codeGenerator2.addList(node16, true, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"/\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"/\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

