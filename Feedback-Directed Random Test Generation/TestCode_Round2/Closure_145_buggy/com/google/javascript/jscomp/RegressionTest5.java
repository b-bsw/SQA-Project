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
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '////" + "'", str1, "////' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '////");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator6.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator6.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator19.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        int[] intArray34 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator26.addList(node27, intArray34);
        codeGenerator19.addList(node24, intArray34);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator19.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator19.addList(node39, true);
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
        codeGenerator19.addList(node42, false, context56);
        codeGenerator6.addList(node16, true, context56);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator6.addList(node61, false, context63);
        codeGenerator2.addList(node3, true, context63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator2.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator2.addList(node68);
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//4 // 4hi!4 /'\"//4hi!4//\"'44hi!44'\"//4hi!4//\"'/hi!/'\"//4hi!4//\"'44hi!44'\"//4hi!4//\"'/ 4hi!4 // 4//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"//4 // 4hi!4 /'\\\"//4hi!4//\\\"'44hi!44'\\\"//4hi!4//\\\"'/hi!/'\\\"//4hi!4//\\\"'44hi!44'\\\"//4hi!4//\\\"'/ 4hi!4 // 4//\"" + "'", str2, "\"//4 // 4hi!4 /'\\\"//4hi!4//\\\"'44hi!44'\\\"//4hi!4//\\\"'/hi!/'\\\"//4hi!4//\\\"'44hi!44'\\\"//4hi!4//\\\"'/ 4hi!4 // 4//\"");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        codeGenerator1.addAllSiblings(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a#a4hi!4a#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        codeGenerator1.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator1.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator1.addList(node39);
        java.lang.Class<?> wildcardClass41 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        int[] intArray29 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator21.addList(node22, intArray29);
        codeGenerator14.addList(node19, intArray29);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator14.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator14.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        codeGenerator40.addList(node45, false, context51);
        codeGenerator14.addList(node37, false, context51);
        codeGenerator1.addList(node11, true, context51);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator1.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        int[] intArray71 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator63.addList(node64, intArray71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator63.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator63.addList(node75, false, context77);
        codeGenerator1.addList(node60, false, context77);
        java.lang.Class<?> wildcardClass80 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/\"\\'\\\\\"/4hi!4/\\\\\"\\'\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\"\\\\'\\\\\\\\\\\"/4hi!4/\\\\\\\\\\\"\\\\'\\\"/'\"" + "'", str1, "\"'/\\\"\\\\'\\\\\\\\\\\"/4hi!4/\\\\\\\\\\\"\\\\'\\\"/'\"");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" //'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'//#'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'//#4444#'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'//hi!'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'//#4444#'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''//'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'//#//'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'// ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a/a4hi!4a/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a/a4hi!4a/a\"" + "'", str1, "\"a/a4hi!4a/a\"");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/ /44hi!44/ /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /44hi!44/ /" + "'", str1, "/ /44hi!44/ /");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator31.addList(node37);
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
        codeGenerator31.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator31.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node68, true, context70);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node28, 0, context70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        codeGenerator46.addAllSiblings(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator64.addList(node65, false, context67);
        codeGenerator56.addList(node61, false, context67);
        codeGenerator46.addList(node53, false, context67);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        int[] intArray81 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator73.addList(node74, intArray81);
        codeGenerator46.addList(node71, intArray81);
        codeGenerator1.addList(node44, intArray81);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator1.addList(node85, true);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator1.addList(node88, true);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator1.addAllSiblings(node91);
        com.google.javascript.rhino.Node node93 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node93);
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
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node34, false, context36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        int[] intArray55 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator47.addList(node48, intArray55);
        codeGenerator42.addList(node45, intArray55);
        codeGenerator33.addList(node40, intArray55);
        codeGenerator1.addList(node31, intArray55);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        int[] intArray71 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator63.addList(node64, intArray71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator63.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator63.addList(node75, false, context77);
        codeGenerator1.addList(node60, true, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//////4hi!4//////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        codeGenerator16.addList(node21, intArray31);
        codeGenerator1.addList(node14, intArray31);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        int[] intArray60 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator52.addList(node53, intArray60);
        codeGenerator47.addList(node50, intArray60);
        codeGenerator38.addList(node45, intArray60);
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
        codeGenerator38.addList(node64, true, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node35, (-1), context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //", 'a', "/\" //ahi!a/ hi! /ahi!a// \"/", "//'\\'\"\\\\\\\\\"\\\\\\\\\"\"\\''//", "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a// ///\" //ahi!a/ hi! /ahi!a// \"/ hi! /\" //ahi!a/ hi! /ahi!a// \"///44hi!4444hi!4444hi!44///\" //ahi!a/ hi! /ahi!a// \"/ hi! /\" //ahi!a/ hi! /ahi!a// \"/// //a" + "'", str6, "a// ///\" //ahi!a/ hi! /ahi!a// \"/ hi! /\" //ahi!a/ hi! /ahi!a// \"///44hi!4444hi!4444hi!44///\" //ahi!a/ hi! /ahi!a// \"/ hi! /\" //ahi!a/ hi! /ahi!a// \"/// //a");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        int[] intArray35 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator27.addList(node28, intArray35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        int[] intArray47 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator39.addList(node40, intArray47);
        codeGenerator27.addList(node37, intArray47);
        codeGenerator16.addList(node25, intArray47);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        com.google.javascript.rhino.Node node63 = null;
        int[] intArray69 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator53.addList(node63, intArray69);
        codeGenerator16.addList(node51, intArray69);
        codeGenerator13.addList(node14, intArray69);
        codeGenerator1.addList(node11, intArray69);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        int[] intArray84 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator76.addList(node77, intArray84);
        codeGenerator1.addList(node74, intArray84);
        com.google.javascript.rhino.Node node87 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator19.addList(node22, intArray32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        codeGenerator19.addList(node37, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node50, false, context52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator57.addList(node58, false, context60);
        codeGenerator49.addList(node54, false, context60);
        codeGenerator19.addList(node46, true, context60);
        codeGenerator1.addList(node16, false, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/ hi! /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "// hi! //" + "'", str1, "// hi! //");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"'/" + "'", str1, "/'\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"'/");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        codeGenerator1.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator1.addAllSiblings(node30);
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        int[] intArray44 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator36.addList(node37, intArray44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        codeGenerator36.addList(node46, intArray56);
        codeGenerator25.addList(node34, intArray56);
        codeGenerator1.addList(node23, intArray56);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node6, false, context8);
        java.lang.Class<?> wildcardClass10 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"'\\\"ahi!a\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\'\\\\\"ahi!a\\\\\"\\'\"'" + "'", str2, "'\"\\'\\\\\"ahi!a\\\\\"\\'\"'");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator19.addList(node22, intArray32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        codeGenerator19.addList(node37, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node50, false, context52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator57.addList(node58, false, context60);
        codeGenerator49.addList(node54, false, context60);
        codeGenerator19.addList(node46, true, context60);
        codeGenerator1.addList(node16, false, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator1.addAllSiblings(node68);
        com.google.javascript.rhino.Node node70 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node70, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        codeGenerator1.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator20.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        int[] intArray42 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator34.addList(node35, intArray42);
        com.google.javascript.rhino.Node node44 = null;
        int[] intArray50 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator34.addList(node44, intArray50);
        codeGenerator20.addList(node32, intArray50);
        codeGenerator1.addList(node18, intArray50);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
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
        codeGenerator26.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator26.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator38.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node57, false, context59);
        codeGenerator48.addList(node53, false, context59);
        codeGenerator38.addList(node45, false, context59);
        codeGenerator26.addList(node35, false, context59);
        codeGenerator1.addList(node23, false, context59);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator1.addList(node67, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\" /4#\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\" aa \\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"#/44hi!44/#\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\" aa \\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"#4/ hi! /4#\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\" aa \\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"#/44hi!44/#\\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\" aa \\\\\"\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"\\\\\"#4/ \"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"44hi!44\"'", 'a', "\"\\\"/  /\\\"\"", "'\"4///\\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\" aaaa \\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\"///4\"'", "#\"\\\"4/'/\\\\\\\" hi! \\\\\\\"/'/hi!/'/\\\\\\\" hi! \\\\\\\"/'/4\\\"\"/// aa ///\"///hi!///\"\"///hi!///\"/// aa ///\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"/// aa ///\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"/// aa ////hi!/\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"/// aa ///\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"\"///hi!///\"/// aa ///\"///hi!///\"\"///hi!///\"/// aa ////// aa ///\"\\\"4/'/\\\\\\\" hi! \\\\\\\"/'/hi!/'/\\\\\\\" hi! \\\\\\\"/'/4\\\"\"#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a'\"4///\\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\" aaaa \\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\"///4\"'\"\\\"/  /\\\"\"44hi!44\"\\\"/  /\\\"\"'\"4///\\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\" aaaa \\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\"///4\"'a" + "'", str6, "a'\"4///\\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\" aaaa \\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\"///4\"'\"\\\"/  /\\\"\"44hi!44\"\\\"/  /\\\"\"'\"4///\\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\" aaaa \\\\\"/4/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/hi!/\\'/\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"/\\'/4/\\\\\"///4\"'a");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/'\\\\'4///\\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\" aaaa \\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\"///4\\\\''/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\\'4///\\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\" aaaa \\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\"///4\\\\''/\"" + "'", str1, "\"/'\\\\'4///\\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\" aaaa \\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\"///4\\\\''/\"");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"a\\\"/\\\\\\\"44hi!44\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"44hi!44\\\\\\\"/\\\"a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"a\\\\\\\"/\\\\\\\\\\\\\\\"44hi!44\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"44hi!44\\\\\\\\\\\\\\\"/\\\\\\\"a\\\"\"" + "'", str1, "\"\\\"a\\\\\\\"/\\\\\\\\\\\\\\\"44hi!44\\\\\\\\\\\\\\\"/\\\\\\\"/hi!/\\\\\\\"/\\\\\\\\\\\\\\\"44hi!44\\\\\\\\\\\\\\\"/\\\\\\\"a\\\"\"");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        int[] intArray22 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator14.addList(node15, intArray22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator14.addList(node26, false, context28);
        codeGenerator1.addList(node11, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node17, (-1), context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"//" + "'", str1, "//\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"//");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        int[] intArray34 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator26.addList(node27, intArray34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        codeGenerator26.addList(node36, intArray46);
        codeGenerator15.addList(node24, intArray46);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator15.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator15.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator57.addList(node66, true, context68);
        codeGenerator15.addList(node54, false, context68);
        codeGenerator1.addList(node12, false, context68);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator1.addList(node72, false);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
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
        codeGenerator1.addList(node24, true);
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
        codeGenerator1.addList(node27, true, context54);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node58, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator31.addList(node37);
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
        codeGenerator31.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        int[] intArray76 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator68.addList(node69, intArray76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator68.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator68.addList(node80, false, context82);
        codeGenerator31.addList(node65, true, context82);
        codeGenerator1.addList(node28, false, context82);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addList(node86);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator1.addAllSiblings(node88);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        int[] intArray17 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator9.addList(node10, intArray17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addList(node30, false);
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
        codeGenerator24.addList(node33, intArray55);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        int[] intArray69 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator61.addList(node62, intArray69);
        com.google.javascript.rhino.Node node71 = null;
        int[] intArray77 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator61.addList(node71, intArray77);
        codeGenerator24.addList(node59, intArray77);
        codeGenerator21.addList(node22, intArray77);
        codeGenerator9.addList(node19, intArray77);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator84 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83);
        com.google.javascript.rhino.Node node85 = null;
        int[] intArray92 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator84.addList(node85, intArray92);
        codeGenerator9.addList(node82, intArray92);
        codeGenerator1.addList(node7, intArray92);
        com.google.javascript.rhino.Node node96 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node96, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator32.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        int[] intArray47 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator39.addList(node40, intArray47);
        codeGenerator32.addList(node37, intArray47);
        codeGenerator1.addList(node30, intArray47);
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node51, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'///\"44hi!44\"///'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
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
            codeGenerator1.add("4/'\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"'/a4hi!4a/'\"/\\'/\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'/\\'/\"'/4");
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
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        int[] intArray34 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator26.addList(node27, intArray34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        codeGenerator26.addList(node36, intArray46);
        codeGenerator15.addList(node24, intArray46);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator15.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator15.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator57.addList(node66, true, context68);
        codeGenerator15.addList(node54, false, context68);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator15.addList(node71, true);
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
        codeGenerator15.addList(node74, false, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node12, (int) (short) 0, context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        codeGenerator1.addList(node55, false);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node58);
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
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
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
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\" hi! \"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\" hi! \"///" + "'", str1, "///\" hi! \"///");
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"a /44/hi!/44/ a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a /44/hi!/44/ a\"" + "'", str1, "\"a /44/hi!/44/ a\"");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        codeGenerator1.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
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
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator48.addList(node64, true);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addList(node71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator70.addList(node73, false);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator70.addList(node76, false);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator70.addList(node79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator70.addAllSiblings(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator70.addList(node83, true, context85);
        codeGenerator48.addList(node67, false, context85);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node45, 0, context85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        com.google.javascript.jscomp.CodeGenerator.Context context35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node34, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator43.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator43.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator43.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        int[] intArray65 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator57.addList(node58, intArray65);
        com.google.javascript.rhino.Node node67 = null;
        int[] intArray73 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator57.addList(node67, intArray73);
        codeGenerator43.addList(node55, intArray73);
        codeGenerator1.addList(node41, intArray73);
        com.google.javascript.rhino.Node node77 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
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
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = null;
        codeGenerator1.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addList(node46, true);
        java.lang.Class<?> wildcardClass49 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" //\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"/ hi! /\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " //\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"/ hi! /\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"// " + "'", str1, " //\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"/ hi! /\"'\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\''\"// ");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        int[] intArray29 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator21.addList(node22, intArray29);
        codeGenerator14.addList(node19, intArray29);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator14.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator14.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        codeGenerator40.addList(node45, false, context51);
        codeGenerator14.addList(node37, false, context51);
        codeGenerator1.addList(node11, true, context51);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator1.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
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
        codeGenerator22.addList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node36, false, context38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        int[] intArray50 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator42.addList(node43, intArray50);
        codeGenerator35.addList(node40, intArray50);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator35.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator35.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator61.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator69.addList(node70, false, context72);
        codeGenerator61.addList(node66, false, context72);
        codeGenerator35.addList(node58, false, context72);
        codeGenerator22.addList(node32, true, context72);
        codeGenerator1.addList(node19, false, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\" hi! \"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  //ahi!a/ hi! /ahi!a//  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  //ahi!a/ hi! /ahi!a//  /" + "'", str1, "/  //ahi!a/ hi! /ahi!a//  /");
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"44hi!44\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"44hi!44\"/'/" + "'", str1, "/'/\"44hi!44\"/'/");
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        codeGenerator1.addList(node41);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        codeGenerator34.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator34.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator34.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        int[] intArray58 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator50.addList(node51, intArray58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator50.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator50.addList(node62, false, context64);
        codeGenerator34.addList(node47, true, context64);
        codeGenerator1.addList(node31, true, context64);
        java.lang.Class<?> wildcardClass68 = context64.getClass();
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "4//'/\" hi! \"/'//hi!//'/\" hi! \"/'//4", "/\"//\\\" hi! \\\"//\"/", "//\"' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator16.addList(node24, true, context26);
        codeGenerator1.addList(node13, true, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node33, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "////' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '////" + "'", str2, "////' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// '////");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        codeGenerator1.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator41.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator41.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator41.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator41.addList(node54, true, context56);
        codeGenerator1.addList(node38, true, context56);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator1.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator64.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator64.addList(node69, false, context71);
        codeGenerator1.addList(node61, true, context71);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a/ ////\"/ aa /\"44hi!44\"/ aa /\"///////\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"\"/ aa /\"///////\"/ aa /\"44hi!44\"/ aa /\"///////\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"\"/ aa /\"///////\"/ aa /\"44hi!44\"/ aa /\"//////\"/ aa /\"44hi!44\"/ aa /\"//// /a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a/ ////\"/ aa /\"44hi!44\"/ aa /\"///////\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"\"/ aa /\"///////\"/ aa /\"44hi!44\"/ aa /\"///////\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"\"/ aa /\"///////\"/ aa /\"44hi!44\"/ aa /\"//////\"/ aa /\"44hi!44\"/ aa /\"//// /a/" + "'", str2, "/a/ ////\"/ aa /\"44hi!44\"/ aa /\"///////\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"\"/ aa /\"///////\"/ aa /\"44hi!44\"/ aa /\"///////\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"// //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// //\"/ aa /\"\"/ aa /\"///////\"/ aa /\"44hi!44\"/ aa /\"//////\"/ aa /\"44hi!44\"/ aa /\"//// /a/");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\"//a\\\\\" //ahi!a/ hi! /ahi!a// \\\\\"4hi!4\\\\\" //ahi!a/ hi! /ahi!a// \\\\\"a//\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"a// aaaa //a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"a// aaaa //a\"/" + "'", str1, "/\"a// aaaa //a\"/");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'\"  /////\\\\\" aaaa \\\\\"/// hi! ///\\\\\" aaaa \\\\\"/////44hi!4444hi!4444hi!44/////\\\\\" aaaa \\\\\"/// hi! ///\\\\\" aaaa \\\\\"/////  \"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'\"  /////\\\\\" aaaa \\\\\"/// hi! ///\\\\\" aaaa \\\\\"/////44hi!4444hi!4444hi!44/////\\\\\" aaaa \\\\\"/// hi! ///\\\\\" aaaa \\\\\"/////  \"'//" + "'", str2, "//'\"  /////\\\\\" aaaa \\\\\"/// hi! ///\\\\\" aaaa \\\\\"/////44hi!4444hi!4444hi!44/////\\\\\" aaaa \\\\\"/// hi! ///\\\\\" aaaa \\\\\"/////  \"'//");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray75 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator67.addList(node68, intArray75);
        codeGenerator40.addList(node65, intArray75);
        codeGenerator1.addList(node38, intArray75);
        java.lang.Class<?> wildcardClass79 = intArray75.getClass();
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" /44/hi!/44/ ", ' ', "/a/\"\\\"4hi!4\\\"\"//'\"/hi!/\"'/\"\\\"4hi!4\\\"\"/'//\" hi! \"//'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'//\" hi! \"//'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'//\" hi! \"//'//'//\" hi! \"//'//'\"/hi!/\"'/\"\\\"4hi!4\\\"\"/\"\\\"4hi!4\\\"\"/a/", "'\"//a\\\\\" //ahi!a/ hi! /ahi!a// \\\\\"4hi!4\\\\\" //ahi!a/ hi! /ahi!a// \\\\\"a//\"'", "\"\\\" /a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ hi! \\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a//a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ \\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  /44/hi!/44/  " + "'", str6, "  /44/hi!/44/  ");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  hi!  ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/  hi!  /" + "'", str2, "/  hi!  /");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        int[] intArray42 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator34.addList(node35, intArray42);
        codeGenerator27.addList(node32, intArray42);
        codeGenerator16.addList(node25, intArray42);
        codeGenerator1.addList(node14, intArray42);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator50.addList(node53, intArray63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator50.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator71.addList(node72, false, context74);
        codeGenerator50.addList(node68, true, context74);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator80.addList(node81, false, context83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer87 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator88 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator88.addList(node89, false, context91);
        codeGenerator80.addList(node85, false, context91);
        codeGenerator50.addList(node77, true, context91);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node47, (int) (byte) 10, context91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator28.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
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
        codeGenerator28.addList(node37, false, context61);
        codeGenerator20.addList(node25, false, context61);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68);
        com.google.javascript.rhino.Node node70 = null;
        int[] intArray77 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator69.addList(node70, intArray77);
        codeGenerator20.addList(node67, intArray77);
        codeGenerator1.addList(node18, intArray77);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator1.addList(node81, true);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator1.addList(node84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addList(node86, true);
        com.google.javascript.rhino.Node node89 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator17.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
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
        codeGenerator17.addList(node24, false, context38);
        codeGenerator1.addList(node14, false, context38);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer6 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator7 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator7.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator7.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator7.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator7.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator7.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        int[] intArray31 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator23.addList(node24, intArray31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator23.addList(node35, false, context37);
        codeGenerator7.addList(node20, true, context37);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator7.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator7.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator47.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator47.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator47.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator47.addList(node60, true, context62);
        codeGenerator7.addList(node44, true, context62);
        codeGenerator1.addList(node4, false, context62);
        com.google.javascript.rhino.Node node66 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator31.addList(node37);
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
        codeGenerator31.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        int[] intArray76 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator68.addList(node69, intArray76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator68.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator68.addList(node80, false, context82);
        codeGenerator31.addList(node65, true, context82);
        codeGenerator1.addList(node28, false, context82);
        com.google.javascript.rhino.Node node86 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node86, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\" aaaa \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\" aaaa \"'" + "'", str1, "'\" aaaa \"'");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node34, false, context36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        int[] intArray55 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator47.addList(node48, intArray55);
        codeGenerator42.addList(node45, intArray55);
        codeGenerator33.addList(node40, intArray55);
        codeGenerator1.addList(node31, intArray55);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        int[] intArray76 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator68.addList(node69, intArray76);
        codeGenerator63.addList(node66, intArray76);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator63.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator84 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator84.addList(node85, false, context87);
        codeGenerator63.addList(node81, true, context87);
        codeGenerator1.addList(node60, false, context87);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a// ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// /a/a4hi!4a/a/ ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// //a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        codeGenerator1.addList(node67, true);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator31.addList(node37);
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
        codeGenerator31.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        int[] intArray76 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator68.addList(node69, intArray76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator68.addList(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator68.addList(node80, false, context82);
        codeGenerator31.addList(node65, true, context82);
        codeGenerator1.addList(node28, false, context82);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addList(node86);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a//# hi! #///'/\" hi! \"/'////////'/\" hi! \"/'////////'/\" hi! \"/'////'/\" hi! \"/'///# hi! #//a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator24.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        int[] intArray44 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator36.addList(node37, intArray44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        codeGenerator36.addList(node46, intArray56);
        codeGenerator24.addList(node34, intArray56);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator62.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator62.addList(node68, false);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        int[] intArray81 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator73.addList(node74, intArray81);
        codeGenerator62.addList(node71, intArray81);
        codeGenerator24.addList(node60, intArray81);
        codeGenerator1.addList(node22, intArray81);
        com.google.javascript.rhino.Node node86 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator14.addList(node19, false, context25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node50, false, context52);
        codeGenerator41.addList(node46, false, context52);
        codeGenerator31.addList(node38, false, context52);
        codeGenerator14.addList(node28, false, context52);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator14.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator63.addList(node68, false, context70);
        codeGenerator14.addList(node60, false, context70);
        codeGenerator1.addList(node11, false, context70);
        com.google.javascript.rhino.Node node74 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node74, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\" /a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ hi! \\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a//a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ \\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\" /a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ hi! \\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a//a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ \\\"\"//" + "'", str1, "//\"\\\" /a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ hi! \\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"/a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a//a//# hi! #///'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////////'/\\\\\\\" hi! \\\\\\\"/'////'/\\\\\\\" hi! \\\\\\\"/'///# hi! #//a/ \\\"\"//");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        int[] intArray15 = null;
        codeGenerator1.addList(node14, intArray15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator66.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator66.addList(node71, false, context73);
        codeGenerator58.addList(node63, false, context73);
        codeGenerator1.addList(node55, true, context73);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator1.addAllSiblings(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator1.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node81);
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
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'/\\'\"\\\\\\\\\"\\\\\\\\\"\"\\'/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"" + "'", str1, "\"/'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'/\"");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("///ahi!a///", '4', "#/// aaaa ///#", "// ////\"44hi!44\"///////\"\\\"\\\"\"///////\"44hi!44\"///////\"\\\"\\\"\"///////\"44hi!44\"//////\"44hi!44\"//// //", "/\"\\\"4 aaaa 4\\\"\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4///ahi!a///4" + "'", str6, "4///ahi!a///4");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a// ///\" //ahi!a/ hi! /ahi!a// \"/ hi! /\" //ahi!a/ hi! /ahi!a// \"///44hi!4444hi!4444hi!44///\" //ahi!a/ hi! /ahi!a// \"/ hi! /\" //ahi!a/ hi! /ahi!a// \"/// //a", ' ', "\"//\"", "//'\\'#/\"\"/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! #/\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'//\\\\\\'\"\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\"\"\\\\\\'/# hi! ## hi! #/\"\"/#\\''//", "4///\"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\" aaaa \"/4/'/\\\" hi! \\\"/'/hi!/'/\\\" hi! \\\"/'/4/\"///4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " a// ///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"///44hi!4444hi!4444hi!44///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"/// //a " + "'", str6, " a// ///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"///44hi!4444hi!4444hi!44///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"/// //a ");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, false);
        java.lang.Class<?> wildcardClass20 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        codeGenerator1.addList(node93);
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
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        int[] intArray35 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator27.addList(node28, intArray35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        int[] intArray47 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator39.addList(node40, intArray47);
        codeGenerator27.addList(node37, intArray47);
        codeGenerator16.addList(node25, intArray47);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        int[] intArray61 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator53.addList(node54, intArray61);
        com.google.javascript.rhino.Node node63 = null;
        int[] intArray69 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator53.addList(node63, intArray69);
        codeGenerator16.addList(node51, intArray69);
        codeGenerator13.addList(node14, intArray69);
        codeGenerator1.addList(node11, intArray69);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator1.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator79.addList(node80, false, context82);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer86 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator87 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator87.addList(node88, false, context90);
        codeGenerator79.addList(node84, false, context90);
        codeGenerator1.addList(node76, false, context90);
        com.google.javascript.rhino.Node node94 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node94, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addList(node44, false);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator41.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        int[] intArray60 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator52.addList(node53, intArray60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        int[] intArray72 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator64.addList(node65, intArray72);
        codeGenerator52.addList(node62, intArray72);
        codeGenerator41.addList(node50, intArray72);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator41.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator41.addList(node78, true, context80);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node38, (int) (short) -1, context80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        codeGenerator1.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator1.addAllSiblings(node28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///////4hi!4///////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("# /44hi!44/ /\"/'\\\"4hi!4\\\"'/\"//'\" //ahi!a/ hi! /ahi!a// \"'// /44hi!44/ /hi!///'\" //ahi!a/ hi! /ahi!a// \"'// /44hi!44/ \"/'\\\"4hi!4\\\"'/\"/ /44hi!44/ #", '4', "", "#4444#", "4/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4# /44hi!44/ //#4444#4/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/44hi!44/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/4#4444#///#4444# //ahi!a/ hi! /ahi!a// #4444#// /44hi!44/ /hi!///#4444# //ahi!a/ hi! /ahi!a// #4444#// /44hi!44/ /#4444#4/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/44hi!44/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/4#4444#// /44hi!44/ #4" + "'", str6, "4# /44hi!44/ //#4444#4/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/44hi!44/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/4#4444#///#4444# //ahi!a/ hi! /ahi!a// #4444#// /44hi!44/ /hi!///#4444# //ahi!a/ hi! /ahi!a// #4444#// /44hi!44/ /#4444#4/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/44hi!44/\"/\\\"\\\"/\"\"hi!\"'\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\" hi! '\"\\\\\" hi! \\\\\"\"''\"\\\\\" hi! \\\\\"\"'\"hi!\"\"hi!\"\"/\\\"\\\"/\"/4#4444#// /44hi!44/ #4");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator1.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node51);
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
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        int[] intArray29 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator21.addList(node22, intArray29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        int[] intArray41 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator33.addList(node34, intArray41);
        codeGenerator21.addList(node31, intArray41);
        codeGenerator11.addList(node19, intArray41);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator11.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator11.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node62, false, context64);
        codeGenerator11.addList(node54, true, context64);
        codeGenerator1.addList(node8, true, context64);
        java.lang.Class<?> wildcardClass68 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        codeGenerator1.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addAllSiblings(node35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\" 4 aaaa 4 \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '#', "//#aa//ahi!a//aa#//", "'/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/'", "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##" + "'", str6, "##");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        codeGenerator1.addList(node36, false);
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
        codeGenerator1.addList(node39, intArray61);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65);
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
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = null;
        codeGenerator70.addList(node79, true, context81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator86 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator86.addList(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator86.addList(node89, false);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator86.addList(node92);
        com.google.javascript.rhino.Node node94 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context96 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator86.addList(node94, true, context96);
        codeGenerator70.addList(node83, false, context96);
        codeGenerator1.addList(node67, false, context96);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context96 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context96.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator19.addList(node22, intArray32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        codeGenerator19.addList(node37, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator19.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, false, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        int[] intArray65 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator57.addList(node58, intArray65);
        codeGenerator50.addList(node55, intArray65);
        codeGenerator19.addList(node48, intArray65);
        codeGenerator11.addList(node17, intArray65);
        codeGenerator1.addList(node9, intArray65);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator1.addAllSiblings(node71);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, true);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator20.addList(node21, false, context23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator28.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
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
        codeGenerator28.addList(node37, false, context61);
        codeGenerator20.addList(node25, false, context61);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68);
        com.google.javascript.rhino.Node node70 = null;
        int[] intArray77 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator69.addList(node70, intArray77);
        codeGenerator20.addList(node67, intArray77);
        codeGenerator1.addList(node18, intArray77);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator1.addList(node81, true);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator1.addList(node84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addList(node86, true);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = null;
        codeGenerator1.addList(node89, false, context91);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator1.addList(node93);
        com.google.javascript.rhino.Node node95 = null;
        codeGenerator1.addAllSiblings(node95);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/// 4hi!4 ///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//// 4hi!4 ////" + "'", str1, "//// 4hi!4 ////");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4 ///'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'//44hi!44//'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'/// 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4 ///'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'//44hi!44//'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'/// 4/" + "'", str1, "/4 ///'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'//44hi!44//'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'/// 4/");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/'\"/" + "'", str2, "/\"'/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/'\"/");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator1.addList(node14, true, context24);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addAllSiblings(node27);
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator19.addList(node22, intArray32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        codeGenerator19.addList(node37, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator19.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator50.addList(node51, false, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        int[] intArray65 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator57.addList(node58, intArray65);
        codeGenerator50.addList(node55, intArray65);
        codeGenerator19.addList(node48, intArray65);
        codeGenerator11.addList(node17, intArray65);
        codeGenerator1.addList(node9, intArray65);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator1.addList(node71);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator1.addList(node68, true);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator1.addAllSiblings(node71);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addList(node21, false);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        int[] intArray15 = null;
        codeGenerator1.addList(node14, intArray15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        codeGenerator29.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator51.addList(node52, false, context54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator59.addList(node60, false, context62);
        codeGenerator51.addList(node56, false, context62);
        codeGenerator41.addList(node48, false, context62);
        codeGenerator29.addList(node38, false, context62);
        codeGenerator1.addList(node26, true, context62);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator1.addAllSiblings(node68);
        java.lang.Class<?> wildcardClass70 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray69 = null;
        codeGenerator1.addList(node68, intArray69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator1.addAllSiblings(node71);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
        codeGenerator1.addList(node93, true);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator1.addList(node96);
        com.google.javascript.rhino.Node node98 = null;
        codeGenerator1.addList(node98);
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        codeGenerator22.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator22.addList(node30, true, context32);
        codeGenerator1.addList(node19, true, context32);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\\'/\"\\\\\\\\\"4 aaaa 4\\\\\\\\\"\"/\\'/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\\'/\"\\\\\\\\\"4 aaaa 4\\\\\\\\\"\"/\\'/'/" + "'", str2, "/'/\\'/\"\\\\\\\\\"4 aaaa 4\\\\\\\\\"\"/\\'/'/");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
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
        codeGenerator1.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        java.lang.Class<?> wildcardClass33 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node16, (int) (byte) 1, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"#//\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"/hi!/\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"//#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"#//\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"/hi!/\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"//#\"/" + "'", str2, "/\"#//\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"/hi!/\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"\\\"#4444#\\\"//#\"/");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        int[] intArray22 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator14.addList(node15, intArray22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator14.addList(node26, false, context28);
        codeGenerator1.addList(node11, false, context28);
        java.lang.Class<?> wildcardClass31 = context28.getClass();
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\" aa \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\" aa \"//" + "'", str2, "//\" aa \"//");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
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
        codeGenerator47.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer51);
        com.google.javascript.rhino.Node node53 = null;
        int[] intArray60 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator52.addList(node53, intArray60);
        codeGenerator47.addList(node50, intArray60);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator47.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator68.addList(node69, false, context71);
        codeGenerator47.addList(node65, true, context71);
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
        codeGenerator47.addList(node74, true, context88);
        codeGenerator26.addList(node44, false, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node23, (int) '#', context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"//4hi!4//\"'", 'a', "////\" aaaa \"////", "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", "\"/ a#/ aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa / aa / aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa /#a#4444#a#/ aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa / aa / aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa /#a /\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"////\" aaaa \"//////4hi!4//////\" aaaa \"////\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"a" + "'", str6, "a\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"////\" aaaa \"//////4hi!4//////\" aaaa \"////\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"a");
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        codeGenerator1.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        int[] intArray52 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator44.addList(node45, intArray52);
        codeGenerator39.addList(node42, intArray52);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator39.addList(node55, true);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addList(node64, false);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator61.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator61.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator61.addList(node74, true, context76);
        codeGenerator39.addList(node58, false, context76);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node36, (int) (short) -1, context76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
            codeGenerator1.addExpr(node51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'\"/" + "'", str1, "/\"'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"/# hi! #/\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'\"/");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        codeGenerator25.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        int[] intArray44 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator36.addList(node37, intArray44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        codeGenerator36.addList(node46, intArray56);
        codeGenerator25.addList(node34, intArray56);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator25.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator25.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator66.addList(node67, false, context69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        int[] intArray81 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator73.addList(node74, intArray81);
        codeGenerator66.addList(node71, intArray81);
        codeGenerator25.addList(node64, intArray81);
        codeGenerator1.addList(node23, intArray81);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator1.addList(node86);
        com.google.javascript.rhino.Node node88 = null;
        codeGenerator1.addList(node88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/'\"/4hi!4/\"'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context4 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node2, false, context4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\\'/\"\\\\\\\\\"4 aaaa 4\\\\\\\\\"\"/\\''");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        com.google.javascript.rhino.Node node68 = null;
        int[] intArray69 = null;
        codeGenerator1.addList(node68, intArray69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator1.addList(node71);
        com.google.javascript.rhino.Node node73 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node73, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        codeGenerator1.addList(node22, false);
        java.lang.Class<?> wildcardClass25 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'\\\"/hi!/\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"'\\\"/hi!/\\\"'\"//" + "'", str1, "//\"'\\\"/hi!/\\\"'\"//");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\" 4hi!4 \"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\" 4hi!4 \\\"/\"" + "'", str1, "\"/\\\" 4hi!4 \\\"/\"");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
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
        codeGenerator1.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        codeGenerator43.addList(node46, intArray56);
        codeGenerator33.addList(node41, intArray56);
        codeGenerator1.addList(node31, intArray56);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addList(node66, false);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator63.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator73.addList(node74);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator78 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77);
        com.google.javascript.rhino.Node node79 = null;
        int[] intArray86 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator78.addList(node79, intArray86);
        codeGenerator73.addList(node76, intArray86);
        codeGenerator63.addList(node71, intArray86);
        codeGenerator1.addList(node61, intArray86);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator1.addList(node91, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"# hi! #\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        int[] intArray22 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator14.addList(node15, intArray22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator14.addList(node26, false, context28);
        codeGenerator1.addList(node11, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator44.addList(node45, false, context47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        int[] intArray59 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator51.addList(node52, intArray59);
        codeGenerator44.addList(node49, intArray59);
        codeGenerator33.addList(node42, intArray59);
        codeGenerator1.addList(node31, intArray59);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator1.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator1.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        codeGenerator1.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator1.addAllSiblings(node21);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"a/' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '///  /\\\"\\\\\\\"///4hi!4///\\\\\\\"\\\"/' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '/4hi!4\\\"\\\\\\\"///4hi!4///\\\\\\\"\\\"/' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '//  ///' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// '/a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"a/' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '///  /\\\\\\\"\\\\\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\\\\\"\\\\\\\"/' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '/4hi!4\\\\\\\"\\\\\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\\\\\"\\\\\\\"/' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '//  ///' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '/a\\\"\"" + "'", str1, "\"\\\"a/' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '///  /\\\\\\\"\\\\\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\\\\\"\\\\\\\"/' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '/4hi!4\\\\\\\"\\\\\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\\\\\"\\\\\\\"/' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '//  ///' //\\\\\\\" hi! \\\\\\\"//44hi!4444hi!4444hi!44//\\\\\\\" hi! \\\\\\\"// '/a\\\"\"");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\\'/\"\\\\\\\\\"44hi!44\\\\\\\\\"\"/\\''", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\\'/\"\\\\\\\\\"44hi!44\\\\\\\\\"\"/\\''/" + "'", str2, "/'\\'/\"\\\\\\\\\"44hi!44\\\\\\\\\"\"/\\''/");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"/# hi! #/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/# hi! #/\\\"\"" + "'", str1, "\"\\\"/# hi! #/\\\"\"");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator17.addList(node22, false, context24);
        codeGenerator1.addList(node14, true, context24);
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
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator46.addList(node51, false, context53);
        codeGenerator38.addList(node43, false, context53);
        codeGenerator30.addList(node35, true, context53);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator30.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator62 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator62.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator62.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator62.addList(node68, true);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator62.addList(node71, true, context73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator62.addList(node75, false, context77);
        codeGenerator30.addList(node59, true, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node27, (int) '#', context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//'\\\\'4///\\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\" aaaa \\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\"///4\\\\''//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//'\\\\'4///\\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\" aaaa \\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\"///4\\\\''//\"/" + "'", str1, "/\"//'\\\\'4///\\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\" aaaa \\\"/4/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/hi!/\\\\\\\\\\\\'/\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\'/4/\\\"///4\\\\''//\"/");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'a/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'///  /\"\\\\\"///4hi!4///\\\\\"\"/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/4hi!4\"\\\\\"///4hi!4///\\\\\"\"/\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'//  ///\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\'/a'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'a/\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'///  /\"\\\\\\\\\"///4hi!4///\\\\\\\\\"\"/\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'/4hi!4\"\\\\\\\\\"///4hi!4///\\\\\\\\\"\"/\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'//  ///\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'/a\\''" + "'", str2, "'\\'a/\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'///  /\"\\\\\\\\\"///4hi!4///\\\\\\\\\"\"/\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'/4hi!4\"\\\\\\\\\"///4hi!4///\\\\\\\\\"\"/\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'//  ///\\\\\\' //\" hi! \"//44hi!4444hi!4444hi!44//\" hi! \"// \\\\\\'/a\\''");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        int[] intArray41 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator33.addList(node34, intArray41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        int[] intArray53 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator45.addList(node46, intArray53);
        codeGenerator33.addList(node43, intArray53);
        codeGenerator23.addList(node31, intArray53);
        codeGenerator1.addList(node21, intArray53);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator1.addList(node58, false);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
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
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator11.addList(node48, true, context50);
        codeGenerator1.addList(node8, true, context50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        int[] intArray69 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator61.addList(node62, intArray69);
        codeGenerator56.addList(node59, intArray69);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator56.addAllSiblings(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator77.addList(node78, false, context80);
        codeGenerator56.addList(node74, true, context80);
        codeGenerator1.addList(node53, true, context80);
        com.google.javascript.rhino.Node node84 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addList(node25);
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
        codeGenerator19.addList(node27, intArray49);
        codeGenerator1.addList(node17, intArray49);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator1.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node56, (int) '4', context58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\" a#/ aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa / aa / aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa /#a#4444#a#/ aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa / aa / aaaa /'\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"''\\\"4hi!4\\\"''\\\"4hi!4\\\"'/ aaaa /'\\\"4hi!4\\\"'/ aaaa // aaaa /#a \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\" a#/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa / aa / aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa /#a#4444#a#/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa / aa / aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa /#a \"/'" + "'", str2, "'/\" a#/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa / aa / aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa /#a#4444#a#/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa / aa / aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'\\'\\\\\"4hi!4\\\\\"\\'/ aaaa /\\'\\\\\"4hi!4\\\\\"\\'/ aaaa // aaaa /#a \"/'");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator1.addList(node68, false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("#////#", 'a', "a// ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// /a/a4hi!4a/a/ ////\"\\\"\\\"\"///////4hi!4///////\"\\\"\\\"\"//// //a", "'\"\\'\\\\\\\\\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\\\\\\\\\'\\'\"'", "'\" hi! \"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#////#a" + "'", str6, "a#////#a");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator42.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        int[] intArray64 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator56.addList(node57, intArray64);
        codeGenerator51.addList(node54, intArray64);
        codeGenerator42.addList(node49, intArray64);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator71.addList(node74, false, context76);
        codeGenerator42.addList(node68, true, context76);
        codeGenerator1.addList(node39, true, context76);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator1.addAllSiblings(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator1.addAllSiblings(node82);
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'a/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'///  /\\\"\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\"\\\"/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/4hi!4\\\"\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\"\\\"/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'//  ///\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/a'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'a/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'///  /\\\"\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\"\\\"/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/4hi!4\\\"\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\"\\\"/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'//  ///\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/a'\"/" + "'", str1, "/\"'a/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'///  /\\\"\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\"\\\"/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/4hi!4\\\"\\\\\\\\\\\"///4hi!4///\\\\\\\\\\\"\\\"/\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'//  ///\\\\' //\\\" hi! \\\"//44hi!4444hi!4444hi!44//\\\" hi! \\\"// \\\\'/a'\"/");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer3 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator4 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator4.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator4.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator22.addList(node23, false, context25);
        codeGenerator14.addList(node19, false, context25);
        codeGenerator4.addList(node11, false, context25);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator4.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator4.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator4.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator38.addList(node39, false, context41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator46.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator46.addList(node52, true);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator58.addAllSiblings(node63);
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
        codeGenerator68.addList(node73, false, context79);
        codeGenerator58.addList(node65, false, context79);
        codeGenerator46.addList(node55, false, context79);
        codeGenerator38.addList(node43, false, context79);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer86 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator87 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer86);
        com.google.javascript.rhino.Node node88 = null;
        int[] intArray95 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator87.addList(node88, intArray95);
        codeGenerator38.addList(node85, intArray95);
        codeGenerator4.addList(node36, intArray95);
        codeGenerator1.addList(node2, intArray95);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        codeGenerator1.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator1.addList(node40, false);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addList(node26);
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
        codeGenerator20.addList(node28, intArray50);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator20.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addList(node60, true);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator59.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator59.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator71.addList(node72, false, context74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator71.addAllSiblings(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator81.addList(node82, false, context84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer88 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator89 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer88);
        com.google.javascript.rhino.Node node90 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context92 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator89.addList(node90, false, context92);
        codeGenerator81.addList(node86, false, context92);
        codeGenerator71.addList(node78, false, context92);
        codeGenerator59.addList(node68, false, context92);
        codeGenerator20.addList(node56, false, context92);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18, context92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context92 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context92.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"///4hi!4///\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"///4hi!4///\\\"\"/" + "'", str1, "/\"\\\"///4hi!4///\\\"\"/");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
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
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator50.addList(node55, false, context57);
        codeGenerator1.addList(node47, false, context57);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator1.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4//'/\" hi! \"/'//hi!//'/\" hi! \"/'//4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4//'/\" hi! \"/'//hi!//'/\" hi! \"/'//4" + "'", str1, "4//'/\" hi! \"/'//hi!//'/\" hi! \"/'//4");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
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
        codeGenerator1.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node36, false, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        int[] intArray57 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator49.addList(node50, intArray57);
        codeGenerator44.addList(node47, intArray57);
        codeGenerator35.addList(node42, intArray57);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator64.addList(node65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator64.addList(node67, false, context69);
        codeGenerator35.addList(node61, true, context69);
        codeGenerator1.addList(node32, false, context69);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator1.addList(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator1.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator1.addList(node77);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
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
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator18.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator18.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        int[] intArray39 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator31.addList(node32, intArray39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator31.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator31.addList(node43, false, context45);
        codeGenerator18.addList(node28, false, context45);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator50.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator61.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        int[] intArray76 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator68.addList(node69, intArray76);
        codeGenerator61.addList(node66, intArray76);
        codeGenerator50.addList(node59, intArray76);
        codeGenerator18.addList(node48, intArray76);
        codeGenerator1.addList(node16, intArray76);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
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
        codeGenerator1.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node59, (int) (byte) 10);
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
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//a'\" aaaa \"'a#a4hi!4a#a'\" aaaa \"'a//# hi! #//aa#a4hi!4a#a'\" aaaa \"''\" aaaa \"'a//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        int[] intArray34 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator26.addList(node27, intArray34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        codeGenerator26.addList(node36, intArray46);
        codeGenerator15.addList(node24, intArray46);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator15.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator15.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator57.addList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator57.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator57.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator57.addList(node66, true, context68);
        codeGenerator15.addList(node54, false, context68);
        codeGenerator1.addList(node12, false, context68);
        com.google.javascript.rhino.Node node72 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node72, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        codeGenerator1.addList(node61, true);
        java.lang.Class<?> wildcardClass64 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 10, (-1), 0, 100, 10 });
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"\\\"\"/" + "'", str1, "/\"\\\"\\\"\"/");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator16.addList(node24, true, context26);
        codeGenerator1.addList(node13, true, context26);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32, false);
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        int[] intArray36 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator28.addList(node29, intArray36);
        codeGenerator1.addList(node26, intArray36);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator1.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator1.addAllSiblings(node41);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
            codeGenerator1.addExpr(node8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node4, false, context6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator11.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node20, true, context22);
        codeGenerator1.addList(node8, true, context22);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        int[] intArray46 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator38.addList(node39, intArray46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        int[] intArray58 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator50.addList(node51, intArray58);
        codeGenerator38.addList(node48, intArray58);
        codeGenerator27.addList(node36, intArray58);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator27.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator27.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator68.addList(node69, false, context71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        int[] intArray83 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator75.addList(node76, intArray83);
        codeGenerator68.addList(node73, intArray83);
        codeGenerator27.addList(node66, intArray83);
        codeGenerator1.addList(node25, intArray83);
        com.google.javascript.rhino.Node node88 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        codeGenerator1.addList(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("#\"/\\\"\\\"/\"/\" aa \"/////\"44hi!44\"////\"/\\\"\\\"/\"////\"44hi!44\"////////\"44hi!44\"////////\"44hi!44\"////////\"44hi!44\"////////\"44hi!44\"////\"/\\\"\\\"/\"////\"44hi!44\"////////\"44hi!44\"////////\"44hi!44\"////////\"44hi!44\"////////\"44hi!44\"////\"/\\\"\\\"/\"////\"44hi!44\"////\"/\\\"\\\"/\"/\" aa \"/\"/\\\"\\\"/\"#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        int[] intArray21 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator13.addList(node14, intArray21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        int[] intArray33 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator25.addList(node26, intArray33);
        codeGenerator13.addList(node23, intArray33);
        codeGenerator1.addList(node11, intArray33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        int[] intArray58 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator50.addList(node51, intArray58);
        codeGenerator39.addList(node48, intArray58);
        codeGenerator1.addList(node37, intArray58);
        com.google.javascript.rhino.Node node62 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node62, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator14.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        int[] intArray29 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator21.addList(node22, intArray29);
        codeGenerator14.addList(node19, intArray29);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator14.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator14.addList(node34, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator48.addList(node49, false, context51);
        codeGenerator40.addList(node45, false, context51);
        codeGenerator14.addList(node37, false, context51);
        codeGenerator1.addList(node11, true, context51);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator61.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator61.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator70.addList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        int[] intArray83 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator75.addList(node76, intArray83);
        codeGenerator70.addList(node73, intArray83);
        codeGenerator61.addList(node68, intArray83);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer89 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator90 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer89);
        com.google.javascript.rhino.Node node91 = null;
        codeGenerator90.addList(node91);
        com.google.javascript.rhino.Node node93 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context95 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator90.addList(node93, false, context95);
        codeGenerator61.addList(node87, true, context95);
        codeGenerator1.addList(node58, false, context95);
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context95 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context95.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        codeGenerator12.addAllSiblings(node17);
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
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node31, false, context33);
        codeGenerator22.addList(node27, false, context33);
        codeGenerator12.addList(node19, false, context33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        int[] intArray47 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator39.addList(node40, intArray47);
        codeGenerator12.addList(node37, intArray47);
        codeGenerator1.addList(node10, intArray47);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator1.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator1.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator1.addList(node58);
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        int[] intArray44 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator36.addList(node37, intArray44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        codeGenerator36.addList(node46, intArray56);
        codeGenerator25.addList(node34, intArray56);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator25.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator25.addList(node62, true, context64);
        codeGenerator15.addList(node22, true, context64);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node12, 0, context64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        int[] intArray36 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator28.addList(node29, intArray36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        int[] intArray48 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator40.addList(node41, intArray48);
        codeGenerator28.addList(node38, intArray48);
        codeGenerator17.addList(node26, intArray48);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator17.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator17.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator58.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        int[] intArray73 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator65.addList(node66, intArray73);
        codeGenerator58.addList(node63, intArray73);
        codeGenerator17.addList(node56, intArray73);
        codeGenerator14.addList(node15, intArray73);
        codeGenerator1.addList(node11, intArray73);
        com.google.javascript.rhino.Node node79 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node79, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        int[] intArray32 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator24.addList(node25, intArray32);
        codeGenerator19.addList(node22, intArray32);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator19.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator40.addList(node41, false, context43);
        codeGenerator19.addList(node37, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator49.addList(node50, false, context52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context60 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator57.addList(node58, false, context60);
        codeGenerator49.addList(node54, false, context60);
        codeGenerator19.addList(node46, true, context60);
        codeGenerator1.addList(node16, false, context60);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator1.addList(node65, true);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator1.addAllSiblings(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator1.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = null;
        codeGenerator1.addList(node72, true, context74);
        com.google.javascript.rhino.Node node76 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context60 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context60.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/a4hi!4a/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/a4hi!4a/\\\"\"" + "'", str1, "\"\\\"/a4hi!4a/\\\"\"");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator25.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator25.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator25.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator25.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator25.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        int[] intArray56 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator48.addList(node49, intArray56);
        codeGenerator43.addList(node46, intArray56);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator43.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer63 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator64 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator64.addList(node65, false, context67);
        codeGenerator43.addList(node61, true, context67);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator73 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context76 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator73.addList(node74, false, context76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator81.addList(node82, false, context84);
        codeGenerator73.addList(node78, false, context84);
        codeGenerator43.addList(node70, true, context84);
        codeGenerator25.addList(node40, false, context84);
        codeGenerator1.addList(node22, false, context84);
        com.google.javascript.rhino.Node node90 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context76 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context76.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a//a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a//a\"" + "'", str1, "\"a//a\"");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//////4hi!4//////\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        codeGenerator1.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator1.addList(node45, true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        java.lang.Class<?> wildcardClass25 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        int[] intArray9 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator1.addList(node2, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/4 ///'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'//44hi!44//'//\" hi! \"//'/ //\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"//44hi!4444hi!4444hi!44//\"\\\"44hi!44\\\"\" hi! \"\\\"44hi!44\\\"\"// /'//\" hi! \"//'/// 4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
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
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator39.addList(node44, false, context46);
        codeGenerator31.addList(node36, false, context46);
        codeGenerator23.addList(node28, true, context46);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator23.addList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator23.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator23.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator23.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        int[] intArray76 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator68.addList(node69, intArray76);
        codeGenerator63.addList(node66, intArray76);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator63.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator84 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator84.addList(node85, false, context87);
        codeGenerator63.addList(node81, true, context87);
        codeGenerator23.addList(node60, false, context87);
        codeGenerator1.addList(node20, true, context87);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        int[] intArray42 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator34.addList(node35, intArray42);
        codeGenerator27.addList(node32, intArray42);
        codeGenerator16.addList(node25, intArray42);
        codeGenerator1.addList(node14, intArray42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("//a4/\"////\\\" aaaa \\\"////\"//'\"/hi!/\"'/\"////\\\" aaaa \\\"////\"/\"/hi!/\"//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//\"/hi!/\"//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//\"/hi!/\"//\"/hi!/\"//'\"/hi!/\"'/\"////\\\" aaaa \\\"////\"/\"////\\\" aaaa \\\"////\"/\"////\\\" aaaa \\\"////\"/\"/hi!/\"//4hi!4//\"/hi!/\"/\"////\\\" aaaa \\\"////\"4hi!4\"////\\\" aaaa \\\"////\"/\"/hi!/\"//4hi!4//\"/hi!/\"/\"////\\\" aaaa \\\"////\"/\"////\\\" aaaa \\\"////\"//'\"/hi!/\"'/\"////\\\" aaaa \\\"////\"/\"/hi!/\"//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//\"/hi!/\"//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//'\"/hi!/\"'//\"/hi!/\"//\"/hi!/\"//'\"/hi!/\"'/\"////\\\" aaaa \\\"////\"/\"////\\\" aaaa \\\"////\"/4a//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        codeGenerator1.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addList(node22);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
        codeGenerator1.addList(node55, false);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addList(node13, false);
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        int[] intArray52 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator44.addList(node45, intArray52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        int[] intArray64 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator56.addList(node57, intArray64);
        codeGenerator44.addList(node54, intArray64);
        codeGenerator33.addList(node42, intArray64);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer69 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator70 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer69);
        com.google.javascript.rhino.Node node71 = null;
        int[] intArray78 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator70.addList(node71, intArray78);
        com.google.javascript.rhino.Node node80 = null;
        int[] intArray86 = new int[] { 10, (-1), 0, 100, (byte) 10 };
        codeGenerator70.addList(node80, intArray86);
        codeGenerator33.addList(node68, intArray86);
        codeGenerator30.addList(node31, intArray86);
        codeGenerator18.addList(node28, intArray86);
        codeGenerator10.addList(node16, intArray86);
        codeGenerator1.addList(node8, intArray86);
        com.google.javascript.rhino.Node node93 = null;
        codeGenerator1.addList(node93);
        com.google.javascript.rhino.Node node95 = null;
        codeGenerator1.addList(node95);
        com.google.javascript.rhino.Node node97 = null;
        codeGenerator1.addList(node97);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 10, (-1), 0, 100, 10 });
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"/\\'\\\\\"/hi!/\\\\\"\\'/\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"/\\'\\\\\"/hi!/\\\\\"\\'/\"/'/" + "'", str1, "/'/\"/\\'\\\\\"/hi!/\\\\\"\\'/\"/'/");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//a\\\" //ahi!a/ hi! /ahi!a// \\\"4hi!4\\\" //ahi!a/ hi! /ahi!a// \\\"a//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//a\\\\\\\" //ahi!a/ hi! /ahi!a// \\\\\\\"4hi!4\\\\\\\" //ahi!a/ hi! /ahi!a// \\\\\\\"a//\\\"\"" + "'", str1, "\"\\\"//a\\\\\\\" //ahi!a/ hi! /ahi!a// \\\\\\\"4hi!4\\\\\\\" //ahi!a/ hi! /ahi!a// \\\\\\\"a//\\\"\"");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" a// ///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"///44hi!4444hi!4444hi!44///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"/// //a ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ a// ///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"///44hi!4444hi!4444hi!44///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"/// //a /" + "'", str2, "/ a// ///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"///44hi!4444hi!4444hi!44///\"//\" //ahi!a/ hi! /ahi!a// \"//\"/ hi! /\"//\" //ahi!a/ hi! /ahi!a// \"//\"/// //a /");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator1.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator28.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addAllSiblings(node33);
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
        codeGenerator38.addList(node43, false, context49);
        codeGenerator28.addList(node35, false, context49);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        int[] intArray63 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator55.addList(node56, intArray63);
        codeGenerator28.addList(node53, intArray63);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator28.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator71 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator71.addList(node72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator71.addList(node74, false);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator71.addList(node77, false);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator71.addList(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator71.addAllSiblings(node82);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context86 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator71.addList(node84, true, context86);
        codeGenerator28.addList(node68, true, context86);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node25, (int) ' ', context86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context86 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context86.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
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
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        int[] intArray15 = null;
        codeGenerator1.addList(node14, intArray15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20, true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, true);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = null;
        codeGenerator1.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator48.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        int[] intArray67 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator59.addList(node60, intArray67);
        codeGenerator48.addList(node57, intArray67);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator48.addList(node70, true);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer74 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator75 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator75.addList(node76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator75.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator75.addList(node81, false);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer85 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator86 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer85);
        com.google.javascript.rhino.Node node87 = null;
        int[] intArray94 = new int[] { (short) -1, (short) 1, 0, 10, (short) 0, (short) -1 };
        codeGenerator86.addList(node87, intArray94);
        codeGenerator75.addList(node84, intArray94);
        codeGenerator48.addList(node73, intArray94);
        codeGenerator1.addList(node46, intArray94);
        org.junit.Assert.assertTrue("'" + context4 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context4.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1), 1, 0, 10, 0, (-1) });
        org.junit.Assert.assertNotNull(intArray94);
        org.junit.Assert.assertArrayEquals(intArray94, new int[] { (-1), 1, 0, 10, 0, (-1) });
    }
}

