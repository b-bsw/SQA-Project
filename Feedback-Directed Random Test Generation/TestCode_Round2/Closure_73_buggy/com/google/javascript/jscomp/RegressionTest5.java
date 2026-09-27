package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator2.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator36.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator36.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator36.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator36.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator36.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator36.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node61, true, context63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator60.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator60.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator60.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator60.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator76.addList(node77, false);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator76.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator76.addList(node82, false, context84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator76.addAllSiblings(node86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator76.addList(node88, false, context90);
        codeGenerator60.addList(node73, true, context90);
        codeGenerator36.addList(node56, false, context90);
        codeGenerator2.addList(node32, true, context90);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
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
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/a/\"\\\\\"4/hi!/4\\\\\"\"//4#//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//#/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/ hi! /\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/#//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//#4//\"\\\\\"4/hi!/4\\\\\"\"/a/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/a/\"\\\\\"4/hi!/4\\\\\"\"//4#//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//#/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/ hi! /\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/#//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//#4//\"\\\\\"4/hi!/4\\\\\"\"/a/'/" + "'", str1, "/'/a/\"\\\\\"4/hi!/4\\\\\"\"//4#//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//#/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/ hi! /\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/#//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"/4ahi!a4/\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//hi!//\"\\\\\"///hi!///\\\\\"\"//\"\\\\\"///hi!///\\\\\"\"//#4//\"\\\\\"4/hi!/4\\\\\"\"/a/'/");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44#/" + "'", str1, "/#44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44#/");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//\"//" + "'", str2, "//\"//\"//");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\\\"4/hi!/4\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"4/hi!/4\\\"\"//" + "'", str1, "//\"\\\"4/hi!/4\\\"\"//");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'\\\\'#\\\" hi! \\\" hi! \\\" hi! \\\"#\\\\''/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/'\\\\'#\\\" hi! \\\" hi! \\\" hi! \\\"#\\\\''/\"/" + "'", str1, "/\"/'\\\\'#\\\" hi! \\\" hi! \\\" hi! \\\"#\\\\''/\"/");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator1.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator1.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator60.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator60.addArrayList(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator60.addList(node69, false, context71);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node56, 1, context71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator2.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node68);
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"a////hi!////a\"", 'a', "\"'\\\"\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"\\\"'\"", "\" ahi!a \"", " a/a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a/4/hi!/4/a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a//hi!/4/hi!/4/a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a//a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a/a ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"'\\\"\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"\\\"'\"a////hi!////a\"'\\\"\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"\\\"'\"a" + "'", str6, "a\"'\\\"\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"\\\"'\"a////hi!////a\"'\\\"\\\\\\\\\\\"/ahi!a/\\\\\\\\\\\"\\\"'\"a");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        codeGenerator2.addAllSiblings(node90);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator2.addList(node92, false);
        com.google.javascript.rhino.Node node95 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node95, (int) (short) 100);
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
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        codeGenerator1.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node37, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        codeGenerator1.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node26, true, context28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator33.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
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
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node67, true, context69);
        codeGenerator48.addList(node51, true, context69);
        codeGenerator33.addList(node44, true, context69);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node30, context69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#\" hi! \" hi! \" hi! \"#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#\" hi! \" hi! \" hi! \"#/" + "'", str1, "/#\" hi! \" hi! \" hi! \"#/");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/" + "'", str1, "/\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
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
        codeGenerator16.addList(node28, true, context39);
        codeGenerator2.addList(node12, true, context39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator46.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator46.addList(node52, false, context54);
        codeGenerator2.addList(node43, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator2.addArrayList(node57);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "", "/ ///4ahi!a4/// /", "' a/a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a/4/hi!/4/a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a//hi!/4/hi!/4/a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a//a/\"hi!\"ahi!a\"hi!\"/aahi!aa/\"hi!\"ahi!a\"hi!\"/a/a '", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\\'\"/\\\\\\'#\\\\\\\\\" hi! \\\\\\\\\" hi! \\\\\\\\\" hi! \\\\\\\\\"#\\\\\\'/\"\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\\'\\\"/\\\\\\\\\\\\'#\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"#\\\\\\\\\\\\'/\\\"\\\\''\"" + "'", str1, "\"'\\\\'\\\"/\\\\\\\\\\\\'#\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"#\\\\\\\\\\\\'/\\\"\\\\''\"");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
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
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator32.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator32.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator32.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator32.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator52.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator52.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        java.nio.charset.Charset charset61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60, charset61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator62.addAllSiblings(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator62.addList(node70, false, context72);
        codeGenerator52.addList(node58, true, context72);
        codeGenerator32.addList(node49, false, context72);
        codeGenerator23.addList(node28, false, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node19, (int) (short) 1, context72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node46, context47);
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "// 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 //" + "'", str2, "// 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 //");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator1.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator1.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator1.addList(node54);
        java.lang.Class<?> wildcardClass56 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a##a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a##a\"" + "'", str1, "\"a##a\"");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/'\"\\\\\" hi! \\\\\"\"'/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addAllSiblings(node26);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        codeGenerator2.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\" 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 \"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" 4//\\\"hi!\\\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\\\"hi!\\\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\\\"hi!\\\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\\\"hi!\\\"//4 \"" + "'", str1, "\" 4//\\\"hi!\\\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\\\"hi!\\\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\\\"hi!\\\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\\\"hi!\\\"//4 \"");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"'/\\\"hi!\\\"/'\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"#hi!#\"", '4', "4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4", "\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"", "/#44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44#/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4#hi!#4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#44" + "'", str6, "44#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4#hi!#4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#44");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a /'/\"ahi!a\"/' hi! '/\"ahi!a\"/'hi!'/\"ahi!a\"/' hi! '/\"ahi!a\"/'/ a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"a /'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'hi!'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'/ a\"" + "'", str2, "\"a /'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'hi!'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'/ a\"");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
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
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator11.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator11.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator11.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator11.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator35.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator51.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator51.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator51.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator51.addList(node63, false, context65);
        codeGenerator35.addList(node48, true, context65);
        codeGenerator11.addList(node31, false, context65);
        codeGenerator1.addList(node7, false, context65);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator1.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator1.addAllSiblings(node73);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"a////hi!////a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"a////hi!////a\"'" + "'", str2, "'\"a////hi!////a\"'");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\\\\\"'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'\\\\\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\\\\\"'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'\\\\\\\"\\\"\"/");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator2.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator2.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator2.addAllSiblings(node43);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator2.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator2.addAllSiblings(node68);
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
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
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = null;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4//4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addArrayList(node15);
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
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addArrayList(node33);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator37.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator47.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node61, true, context63);
        codeGenerator47.addList(node56, false, context63);
        codeGenerator37.addList(node43, false, context63);
        codeGenerator26.addList(node34, false, context63);
        codeGenerator2.addList(node22, false, context63);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = null;
        codeGenerator2.addList(node69, false, context71);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"ahi!a\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'\\\"ahi!a\\\"'\"/" + "'", str2, "/\"'\\\"ahi!a\\\"'\"/");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator11.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node22, false, context24);
        codeGenerator2.addList(node7, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node32, true, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator31.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, true, context47);
        codeGenerator31.addList(node40, false, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node27, (int) (byte) 100, context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator19.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator19.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator19.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node49, true, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node53, false, context55);
        codeGenerator41.addList(node44, false, context55);
        codeGenerator19.addList(node37, true, context55);
        codeGenerator2.addList(node15, true, context55);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        codeGenerator2.addArrayList(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
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
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"'\\\"///hi!///\\\"'\"", 'a', "'\"\\\\\" hi! \\\\\"\"'", "/// \"hi!\" hi! \"hi!\" ///", "//// 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a'\"\\\\\" hi! \\\\\"\"'/// \"hi!\" hi! \"hi!\" /////// 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ////'\"\\\\\" hi! \\\\\"\"'///hi!/////// 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ////'\"\\\\\" hi! \\\\\"\"'/// \"hi!\" hi! \"hi!\" ///'\"\\\\\" hi! \\\\\"\"'a" + "'", str6, "a'\"\\\\\" hi! \\\\\"\"'/// \"hi!\" hi! \"hi!\" /////// 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ////'\"\\\\\" hi! \\\\\"\"'///hi!/////// 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ////'\"\\\\\" hi! \\\\\"\"'/// \"hi!\" hi! \"hi!\" ///'\"\\\\\" hi! \\\\\"\"'a");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
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
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator9.addList(node14, false, context16);
        codeGenerator2.addList(node5, false, context16);
        java.lang.Class<?> wildcardClass19 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        java.nio.charset.Charset charset6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5, charset6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator7.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator7.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator7.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator7.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator7.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator24.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator39.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator49.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node57, false, context59);
        codeGenerator39.addList(node45, true, context59);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        java.nio.charset.Charset charset65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64, charset65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node67, true, context69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node71, false, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator66.addList(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node77, false, context79);
        codeGenerator39.addList(node62, true, context79);
        codeGenerator24.addList(node36, true, context79);
        codeGenerator7.addList(node20, true, context79);
        codeGenerator2.addList(node3, false, context79);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator2.addList(node85, true);
        java.lang.Class<?> wildcardClass88 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/", ' ', "/4 hi! 4/", "//'/\"\\\\\"4ahi!a4\\\\\"\"/'//", "'// \"hi!\" hi! \"hi!\" //'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //4 hi! 4/'// \"hi!\" hi! \"hi!\" //'/4 hi! 4///'/\"\\\\\"4ahi!a4\\\\\"\"/'///'// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //'/4 hi! 4/hi!'// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //'/4 hi! 4////'/\"\\\\\"4ahi!a4\\\\\"\"/'//'// \"hi!\" hi! \"hi!\" //'/4 hi! 4//4 hi! 4// " + "'", str6, " //4 hi! 4/'// \"hi!\" hi! \"hi!\" //'/4 hi! 4///'/\"\\\\\"4ahi!a4\\\\\"\"/'///'// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //'/4 hi! 4/hi!'// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //''// \"hi!\" hi! \"hi!\" //'/4 hi! 4////'/\"\\\\\"4ahi!a4\\\\\"\"/'//'// \"hi!\" hi! \"hi!\" //'/4 hi! 4//4 hi! 4// ");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator44.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator44.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator57.addList(node58, true, context60);
        codeGenerator44.addList(node53, false, context60);
        codeGenerator34.addList(node40, false, context60);
        codeGenerator16.addList(node31, true, context60);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        java.nio.charset.Charset charset68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67, charset68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addArrayList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator69.addList(node72, true);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator69.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator69.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator69.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        java.nio.charset.Charset charset86 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator87 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85, charset86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator87.addList(node88, true, context90);
        codeGenerator69.addList(node83, false, context90);
        codeGenerator16.addList(node65, true, context90);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addList(node25, true);
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
        codeGenerator32.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node43, false, context45);
        codeGenerator16.addList(node28, true, context45);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator16.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator16.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator56.addList(node61, false, context63);
        codeGenerator16.addList(node52, false, context63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, (-1), context63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator26.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator26.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator42.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator42.addList(node48, false, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator42.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node54, false, context56);
        codeGenerator26.addList(node39, true, context56);
        codeGenerator2.addList(node22, false, context56);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/a/\"ahi!a\"/4/hi!/4/\"ahi!a\"//hi!/4/hi!/4/\"ahi!a\"//\"ahi!a\"/a/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" //aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//a////hi!////a//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa// ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ //aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//a////hi!////a//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa// /" + "'", str2, "/ //aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//a////hi!////a//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa// /");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node29, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        com.google.javascript.jscomp.CodeGenerator.Context context92 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node90, true, context92);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addList(node94);
        com.google.javascript.rhino.Node node96 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node96);
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
        org.junit.Assert.assertTrue("'" + context92 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context92.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        codeGenerator2.addList(node12, false);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
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
        codeGenerator20.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node31, false, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a///hi!///a", ' ', "\"'\\\"/hi!/\\\"'\"", "\"'//\\\\'/\\\"\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\"\\\"/\\\\'//'\"", "'\"/\\\\\"ahi!a\\\\\"/\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " a///hi!///a " + "'", str6, " a///hi!///a ");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" /\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"//\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/// hi! ///\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"//\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " /\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"//\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/// hi! ///\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"//\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/ " + "'", str1, " /\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"//\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/// hi! ///\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"//\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/ ");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        codeGenerator1.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a/\"\\\"4/hi!/4\\\"\"//4#//\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"//hi!//\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"/4ahi!a4/\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"//hi!//\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"//#/\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"/4ahi!a4/\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"/ hi! /\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"/4ahi!a4/\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"/#//\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"//hi!//\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"/4ahi!a4/\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"//hi!//\"\\\"///hi!///\\\"\"//\"\\\"///hi!///\\\"\"//#4//\"\\\"4/hi!/4\\\"\"/a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"///hi!///\\\"\"", '4', "'/\"\\\\\"4ahi!a4\\\\\"\"/'", "/aa/", "/\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4'/\"\\\\\"4ahi!a4\\\\\"\"/'/\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/'/\"\\\\\"4ahi!a4\\\\\"\"/'///hi!////\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/'/\"\\\\\"4ahi!a4\\\\\"\"/''/\"\\\\\"4ahi!a4\\\\\"\"/'4" + "'", str6, "4'/\"\\\\\"4ahi!a4\\\\\"\"/'/\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/'/\"\\\\\"4ahi!a4\\\\\"\"/'///hi!////\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/'/\"\\\\\"4ahi!a4\\\\\"\"/''/\"\\\\\"4ahi!a4\\\\\"\"/'4");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator2.addList(node39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
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
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator20.addList(node31, false, context33);
        codeGenerator2.addList(node17, false, context33);
        java.lang.Class<?> wildcardClass36 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'//" + "'", str2, "//'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'//");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator26.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator26.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator42.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator42.addList(node48, false, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator42.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node54, false, context56);
        codeGenerator26.addList(node39, true, context56);
        codeGenerator2.addList(node22, false, context56);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator2.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator2.addAllSiblings(node62);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\\'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\\\\''\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\\'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\\\\''\"" + "'", str1, "\"'\\\\'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\\\\''\"");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//'\" hi! \"'//", '#', "\"\\\"\\\\\\\"4 /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ hi! /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ 4\\\\\\\"\\\"\"", "\"'//\\\\'/\\\"\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\"\\\"/\\\\'//'\"", "/4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//\"'//\\\\'/\\\"\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\"\\\"/\\\\'//'\"\"\\\"\\\\\\\"4 /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ hi! /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ 4\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"4 /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ hi! /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ 4\\\\\\\"\\\"\"\"'//\\\\'/\\\"\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\"\\\"/\\\\'//'\"//#" + "'", str6, "#//\"'//\\\\'/\\\"\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\"\\\"/\\\\'//'\"\"\\\"\\\\\\\"4 /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ hi! /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ 4\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"4 /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ hi! /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ 4\\\\\\\"\\\"\"\"'//\\\\'/\\\"\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\"\\\"/\\\\'//'\"//#");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator27.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator27.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator27.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator27.addList(node42, true, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node24, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node29, false, context31);
        codeGenerator2.addList(node14, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        codeGenerator2.addList(node16, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" a///hi!///a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator25.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node49, true, context51);
        codeGenerator35.addList(node44, false, context51);
        codeGenerator25.addList(node31, true, context51);
        codeGenerator14.addList(node22, false, context51);
        codeGenerator2.addList(node11, false, context51);
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/\" hi! \"/'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'/\" hi! \"/'//" + "'", str2, "//'/\" hi! \"/'//");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        codeGenerator2.addArrayList(node13);
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"\\\\\\\"4 /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ hi! /'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/hi!/'/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/'/ 4\\\\\\\"\\\"\"", 'a', "/\"//\\\"\\\"//\"/", "'\"/\\\\\"///hi!///\\\\\"/\"'", "/4//4/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/\"//\\\"\\\"//\"//4//4//\"//\\\"\\\"//\"//4//4//4//4//4//4//\"//\\\"\\\"//\"/4 /'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/hi!/'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/ hi! /'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/hi!/'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/ 4/4//4//4//4//4//4//\"//\\\"\\\"//\"//4//4//\"//\\\"\\\"//\"//\"//\\\"\\\"//\"/a" + "'", str6, "a/\"//\\\"\\\"//\"//4//4//\"//\\\"\\\"//\"//4//4//4//4//4//4//\"//\\\"\\\"//\"/4 /'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/hi!/'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/ hi! /'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/hi!/'\"/\\\\\"///hi!///\\\\\"/\"'//4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"/4ahi!a4/4//4//4//4//4//4//4//4//4//4//4//4//4//4//\"//\\\"\\\"//\"//'\"/\\\\\"///hi!///\\\\\"/\"'/ 4/4//4//4//4//4//4//\"//\\\"\\\"//\"//4//4//\"//\\\"\\\"//\"//\"//\\\"\\\"//\"/a");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator20.addList(node26, false, context28);
        codeGenerator2.addList(node17, false, context28);
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        codeGenerator2.addList(node18, true, context72);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator2.addList(node77, true);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator2.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator2.addList(node82, true);
        com.google.javascript.rhino.Node node85 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = null;
        codeGenerator2.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node24, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/ /\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"//\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/// hi! ///\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"//\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"/ /");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator35.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator35.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node52, true, context54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node56, false, context58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator51.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node62, false, context64);
        codeGenerator35.addList(node47, true, context64);
        codeGenerator20.addList(node31, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node17, 0, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        codeGenerator22.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator22.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        java.nio.charset.Charset charset46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45, charset46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator47.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator47.addList(node58, false, context60);
        codeGenerator38.addList(node43, true, context60);
        codeGenerator22.addList(node34, false, context60);
        codeGenerator2.addList(node18, false, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator2.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node29, false, context31);
        codeGenerator2.addList(node14, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator42.addList(node47, false, context49);
        codeGenerator2.addList(node38, false, context49);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addAllSiblings(node52);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node38, false, context40);
        codeGenerator19.addList(node29, false, context40);
        codeGenerator2.addList(node15, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator2.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator2.addArrayList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator53.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator53.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator53.addList(node61, true);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator53.addList(node64, false, context66);
        codeGenerator2.addList(node50, true, context66);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\" hi! \"'", 'a', " 4ahi!a4\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/4 hi! 44ahi!a4hi!4 hi! 44ahi!a4/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"4ahi!a4 ", "\"aa\"", " //aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//a////hi!////a//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa// ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"aa\" 4ahi!a4\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/4 hi! 44ahi!a4hi!4 hi! 44ahi!a4/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"4ahi!a4  hi!  4ahi!a4\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/4 hi! 44ahi!a4hi!4 hi! 44ahi!a4/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"4ahi!a4 \"aa\"a" + "'", str6, "a\"aa\" 4ahi!a4\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/4 hi! 44ahi!a4hi!4 hi! 44ahi!a4/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"4ahi!a4  hi!  4ahi!a4\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"/4 hi! 44ahi!a4hi!4 hi! 44ahi!a4/\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"4ahi!a4 \"aa\"a");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\\'/\"/#/\\\\\\\\\"/hi!/\\\\\\\\\"4ahi!a4\\\\\\\\\"/hi!/\\\\\\\\\"/#/\"/\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\\'/\"/#/\\\\\\\\\"/hi!/\\\\\\\\\"4ahi!a4\\\\\\\\\"/hi!/\\\\\\\\\"/#/\"/\\''/" + "'", str1, "/'\\'/\"/#/\\\\\\\\\"/hi!/\\\\\\\\\"4ahi!a4\\\\\\\\\"/hi!/\\\\\\\\\"/#/\"/\\''/");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\\\\\"\"'" + "'", str2, "'\"\\\\\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\\\\\"\"'");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        java.nio.charset.Charset charset29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28, charset29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node31, true, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator30.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator43.addList(node44, true, context46);
        codeGenerator30.addList(node39, false, context46);
        codeGenerator20.addList(node26, false, context46);
        codeGenerator2.addList(node17, true, context46);
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
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator55.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        java.nio.charset.Charset charset72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71, charset72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator73.addList(node74, true, context76);
        codeGenerator55.addList(node69, false, context76);
        codeGenerator2.addList(node51, true, context76);
        com.google.javascript.rhino.Node node80 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"a////hi!////a\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"a////hi!////a\"//" + "'", str1, "//\"a////hi!////a\"//");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"'/" + "'", str1, "/'\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"'/");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4'\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4'\"///" + "'", str2, "///\"'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4'\"///");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addAllSiblings(node63);
        java.lang.Class<?> wildcardClass65 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"/\\\\\"\"'" + "'", str2, "'\"\\\\\"/\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"/\\\\\"\"'");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        codeGenerator2.addList(node18, true, context72);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator2.addList(node77, true);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator2.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator2.addArrayList(node82);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"aa\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"//" + "'", str1, "//\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"//");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/44ahi!a44/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/44ahi!a44/" + "'", str1, "/44ahi!a44/");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'\"\\\\\" hi! \\\\\"\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"\\\\\"\\'/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\'\\\\\"\"//'" + "'", str2, "'//\"\\\\\"\\'/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\'\\\\\"\"//'");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node14, false, context16);
        java.lang.Class<?> wildcardClass18 = context16.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addAllSiblings(node33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"4/hi!/4\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, true);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator19.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node31, true, context33);
        codeGenerator2.addList(node15, true, context33);
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'/\"\\\\\"\\\\\\\\\\\\\"\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\'\\\\\\\\\\\\\"\\\\\"\"/'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("44#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4#hi!#4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4#hi!#4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#44" + "'", str1, "44#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4#hi!#4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#44");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"4//4\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"4//4\"//" + "'", str1, "//\"4//4\"//");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        codeGenerator2.addList(node18, true, context72);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator2.addList(node77, true);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator2.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node82, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        codeGenerator2.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator2.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, true);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator39.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator39.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        java.nio.charset.Charset charset63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62, charset63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator64.addList(node65, true, context67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator64.addList(node69, false, context71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator64.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator64.addList(node75, false, context77);
        codeGenerator55.addList(node60, true, context77);
        codeGenerator39.addList(node51, false, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36, context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        java.nio.charset.Charset charset12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11, charset12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator13.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator25.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator35.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator35.addList(node43, false, context45);
        codeGenerator25.addList(node31, true, context45);
        codeGenerator13.addList(node22, false, context45);
        codeGenerator2.addList(node9, true, context45);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator2.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator2.addList(node52);
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        codeGenerator2.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"/'/\\\"4ahi!a4\\\"/'/\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"//'" + "'", str2, "'//\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"//'");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/'\\\"hi!\\\"'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\'\\\\\"hi!\\\\\"\\'/\"'" + "'", str2, "'\"/\\'\\\\\"hi!\\\\\"\\'/\"'");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4" + "'", str1, "4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator22.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator22.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator38.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator38.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator38.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator38.addList(node50, false, context52);
        codeGenerator22.addList(node35, true, context52);
        codeGenerator1.addList(node18, false, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator1.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    " + "'", str1, "    ");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator22.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator22.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator38.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator38.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator38.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator38.addList(node50, false, context52);
        codeGenerator22.addList(node35, true, context52);
        codeGenerator1.addList(node18, false, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node23, false, context25);
        codeGenerator2.addList(node14, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addArrayList(node28);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator2.addArrayList(node27);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("#//////#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator68.addList(node69, false);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator68.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator68.addList(node74, false, context76);
        codeGenerator2.addList(node65, true, context76);
        com.google.javascript.rhino.Node node79 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node79, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'" + "'", str2, "'\"\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
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
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//' #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# '//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, true, context38);
        codeGenerator22.addList(node31, false, context38);
        codeGenerator12.addList(node18, true, context38);
        codeGenerator1.addList(node9, false, context38);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator1.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addList(node45);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/ ///4ahi!a4/// /#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/ ///4ahi!a4/// /#/" + "'", str2, "/#/ ///4ahi!a4/// /#/");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\"" + "'", str1, "\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\"");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"#\\\"\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"\\\"//'\\\\'#\\\" hi! \\\" hi! \\\" hi! \\\"#\\\\''/ hi! /'\\\\'#\\\" hi! \\\" hi! \\\" hi! \\\"#\\\\''//\\\"\\\\\\\"/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/\\\\\\\"\\\"#\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\"/" + "'", str1, "/\"4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4\"/");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"/");
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
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
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#\" hi! \" hi! \" hi! \"#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#\" hi! \" hi! \" hi! \"#/" + "'", str2, "/#\" hi! \" hi! \" hi! \"#/");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        codeGenerator1.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node37, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node12, 100, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        codeGenerator2.addList(node9);
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
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/4#////hi!//// hi! ////hi!//// hi! ////hi!//// hi! ////hi!////#4/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/4#////hi!//// hi! ////hi!//// hi! ////hi!//// hi! ////hi!////#4/#/" + "'", str2, "/#/4#////hi!//// hi! ////hi!//// hi! ////hi!//// hi! ////hi!////#4/#/");
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\\'#\" hi! \" hi! \" hi! \"#\\''");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        codeGenerator2.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node33);
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator16.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator44.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator44.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator57.addList(node58, true, context60);
        codeGenerator44.addList(node53, false, context60);
        codeGenerator34.addList(node40, false, context60);
        codeGenerator16.addList(node31, true, context60);
        codeGenerator2.addList(node12, true, context60);
        com.google.javascript.rhino.Node node66 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        codeGenerator2.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator2.addList(node66);
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("#///\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/////\"'\\\" hi! \\\"'\"/4//4/\"'\\\" hi! \\\"'\"/////\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"///#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, true);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        codeGenerator2.addArrayList(node20);
        java.lang.Class<?> wildcardClass22 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
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
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node17, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node12, false, context14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\\'//\"\\\\\\\\\"///hi!///\\\\\\\\\"\"//\\''");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\\'//\\\"\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\"\\\"//\\\\''\"" + "'", str1, "\"'\\\\'//\\\"\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\"\\\"//\\\\''\"");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        codeGenerator2.addList(node11);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//", ' ', "\"##\"", "\"/\\\"\\\\\\\"'/\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"/'\\\\\\\"\\\"/\"", "\"//\\\"\\\"//\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa// " + "'", str6, " //aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa// ");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addList(node23, true);
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
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"'\\\\\\\" hi! \\\\\\\"'\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\'\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"\\'\\\\\"\"'" + "'", str2, "'\"\\\\\"\\'\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"\\'\\\\\"\"'");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21, true);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'//\"\\\\\"///hi!///\\\\\"\"//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'//\"\\\\\"///hi!///\\\\\"\"//'" + "'", str1, "'//\"\\\\\"///hi!///\\\\\"\"//'");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ //hi!// /", '4', "\"'/\\\"4//4\\\"/'\"", "'\"/\\\\\"ahi!a\\\\\"/\"'", "/'\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/ //hi!// /4" + "'", str6, "4/ //hi!// /4");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'a/\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"/\\\\\\'/\"ahi!a\"/\\\\\\'/\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"/4ahi!a4\\\\\\'/\"ahi!a\"/\\\\\\'/\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"/a\\''" + "'", str2, "'\\'a/\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"/\\\\\\'/\"ahi!a\"/\\\\\\'/\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"/4ahi!a4\\\\\\'/\"ahi!a\"/\\\\\\'/\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"//\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"/a\\''");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator44.addList(node52, false, context54);
        codeGenerator34.addList(node40, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node62, true, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node72, false, context74);
        codeGenerator34.addList(node57, true, context74);
        codeGenerator19.addList(node31, true, context74);
        codeGenerator2.addList(node15, true, context74);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator2.addList(node79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator2.addList(node81, true);
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'\"\\\\\" hi! \\\\\"\"'/", ' ', "", "\"/\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"/\"", "\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /\"/\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"/\"\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"\"/\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"/\"/ " + "'", str6, " /\"/\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"/\"\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\" hi! \"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"\"/\\\"'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\"///hi!///\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//'\\\"/\"/ ");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"'\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"'\\\\\\\"\\\"\"");
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/// #/\\\" hi! \\\"/hi!/\\\" hi! \\\"4ahi!a4\\\" hi! \\\"/hi!/\\\" hi! \\\"/# ///\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/// #/\\\" hi! \\\"/hi!/\\\" hi! \\\"4ahi!a4\\\" hi! \\\"/hi!/\\\" hi! \\\"/# ///\"/" + "'", str1, "/\"/// #/\\\" hi! \\\"/hi!/\\\" hi! \\\"4ahi!a4\\\" hi! \\\"/hi!/\\\" hi! \\\"/# ///\"/");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node9, (int) (short) 100, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node26, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addArrayList(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'// \"hi!\" hi! \"hi!\" //'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        codeGenerator2.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" /' #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# '44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44' #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# '/ ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"///" + "'", str1, "///\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"///");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator22.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator22.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator22.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator40.addList(node41, false);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator40.addArrayList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator40.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator40.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator40.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator60.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator60.addList(node68, false, context70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator60.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        java.nio.charset.Charset charset77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76, charset77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator78.addList(node79, true, context81);
        codeGenerator60.addList(node74, false, context81);
        codeGenerator40.addList(node56, true, context81);
        codeGenerator22.addList(node37, false, context81);
        codeGenerator2.addList(node18, true, context81);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator2.addList(node87);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/4/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/4/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/4/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/4/\"/" + "'", str1, "/\"/4/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\\\" hi! \\\" hi! \\\" hi! \\\"#'/4/\"/");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator37.addList(node42, false, context44);
        codeGenerator18.addList(node33, true, context44);
        codeGenerator2.addList(node14, true, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4#/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//hi!/hi!/\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"//\"'\\\"/ hi! /\\\"'\"hi!\"'\\\"/ hi! /\\\"'\"/#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }
}

