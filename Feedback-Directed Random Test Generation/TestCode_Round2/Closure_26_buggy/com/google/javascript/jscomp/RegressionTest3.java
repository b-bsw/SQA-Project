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
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$" + "'", str4, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass15 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = jSModule7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$" + "'", str4, "module$module$module$module$module$");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass14 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("./");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("./");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$hi!" + "'", str8, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = jSModule5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass15 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$hi!" + "'", str12, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$hi!" + "'", str9, "module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = jSModule11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass13 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$hi!" + "'", str10, "module$hi!");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$hi!" + "'", str8, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$hi!" + "'", str7, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$hi!" + "'", str8, "module$module$module$module$hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$" + "'", str6, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass15 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$" + "'", str12, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        java.lang.String str15 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str17 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str15, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str17, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$hi!" + "'", str9, "module$module$module$hi!");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSModule9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$" + "'", str4, "module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule15 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = jSModule15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("./");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$" + "'", str6, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = jSModule3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$hi!" + "'", str7, "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$" + "'", str5, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("./");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$hi!" + "'", str9, "module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$" + "'", str5, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$hi!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$hi!" + "'", str2, "module$module$module$hi!");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$" + "'", str2, "module$module$module$");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("./", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$" + "'", str9, "module$");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$hi!" + "'", str6, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$" + "'", str6, "module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$hi!" + "'", str12, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("./");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$" + "'", str8, "module$module$module$module$");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$" + "'", str4, "module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule13 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = jSModule13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$" + "'", str10, "module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$hi!" + "'", str12, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule13);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$" + "'", str4, "module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule15 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule16 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$hi!" + "'", str12, "module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$" + "'", str14, "module$");
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSModule9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$hi!" + "'", str6, "module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!", false);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass15 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$hi!" + "'", str6, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$" + "'", str10, "module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$" + "'", str6, "module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = jSModule6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$" + "'", str4, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("./");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$" + "'", str6, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$" + "'", str9, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$hi!", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass13 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$hi!" + "'", str9, "module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass8 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = jSModule4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }
}

