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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str15 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str15, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
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
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$hi!", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.Class<?> wildcardClass4 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$" + "'", str9, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$hi!" + "'", str7, "module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$" + "'", str12, "module$");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$hi!");
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
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$hi!" + "'", str9, "module$module$hi!");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$" + "'", str4, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = jSModule12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node13, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$" + "'", str2, "module$module$module$module$");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$" + "'", str2, "module$module$module$module$module$");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$hi!" + "'", str5, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass3 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
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
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str14 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$hi!" + "'", str7, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$" + "'", str6, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str1 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str1, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = jSModule10.getClass();
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
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass7 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass6 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule12 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule12);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
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
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node6, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$hi!" + "'", str8, "module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$hi!" + "'", str8, "module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$" + "'", str7, "module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$" + "'", str9, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$hi!" + "'", str5, "module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$hi!" + "'", str2, "module$module$hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSModule8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule14 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$" + "'", str9, "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$" + "'", str11, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule14);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$", true);
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
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules3.process(node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$hi!" + "'", str7, "module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass4 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", true);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$", false);
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
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$hi!" + "'", str9, "module$hi!");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$hi!" + "'", str4, "module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
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
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass11 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$" + "'", str9, "module$module$module$module$");
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$" + "'", str5, "module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$hi!");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass12 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$hi!" + "'", str7, "module$module$hi!");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$", false);
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
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$");
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("./");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules3.getModule();
        java.lang.String str11 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str15 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass16 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$" + "'", str6, "module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$" + "'", str8, "module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str15, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules3.getModule();
        java.lang.String str8 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str12 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$hi!");
        java.lang.Class<?> wildcardClass5 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$hi!" + "'", str4, "module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        org.junit.Assert.assertNull(jSModule3);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule8 = processCommonJSModules3.getModule();
        java.lang.String str10 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$hi!" + "'", str5, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$" + "'", str7, "module$module$module$module$module$");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules2.getModule();
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$hi!", "./");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        java.lang.String str7 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str9 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str9, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass11 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass9 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$hi!" + "'", str6, "module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$" + "'", str2, "module$module$");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule11 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule11);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$" + "'", str5, "module$module$");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        java.lang.Class<?> wildcardClass8 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$hi!" + "'", str2, "module$hi!");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str10 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("module$hi!");
        java.lang.String str14 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str10, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$hi!" + "'", str12, "module$module$hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "module$module$module$module$module$module$module$" + "'", str14, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule7 = processCommonJSModules2.getModule();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule7);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$" + "'", str2, "module$");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "./");
        com.google.javascript.jscomp.JSModule jSModule3 = processCommonJSModules2.getModule();
        java.lang.String str5 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule6 = processCommonJSModules2.getModule();
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$hi!" + "'", str5, "module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$hi!" + "'", str11, "module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("");
        java.lang.Class<?> wildcardClass7 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$" + "'", str6, "module$");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.String str6 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$hi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$", false);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("");
        java.lang.String str9 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$hi!");
        java.lang.Class<?> wildcardClass10 = processCommonJSModules3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str5, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$" + "'", str7, "module$");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "module$module$module$module$module$module$module$hi!" + "'", str9, "module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        java.lang.String str7 = processCommonJSModules3.guessCJSModuleName("module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "module$module$module$module$module$module$module$" + "'", str7, "module$module$module$module$module$module$module$");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "", true);
        java.lang.String str5 = processCommonJSModules3.guessCJSModuleName("");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "module$" + "'", str5, "module$");
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$" + "'", str8, "module$module$");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", false);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        com.google.javascript.jscomp.JSModule jSModule5 = processCommonJSModules3.getModule();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules3 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$", true);
        com.google.javascript.jscomp.JSModule jSModule4 = processCommonJSModules3.getModule();
        java.lang.Class<?> wildcardClass5 = processCommonJSModules3.getClass();
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        com.google.javascript.jscomp.JSModule jSModule10 = processCommonJSModules2.getModule();
        java.lang.String str12 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.Class<?> wildcardClass13 = processCommonJSModules2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$hi!" + "'", str4, "module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$hi!" + "'", str6, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$" + "'", str8, "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str12, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$hi!");
        java.lang.String str6 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$");
        java.lang.String str8 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.jscomp.JSModule jSModule9 = processCommonJSModules2.getModule();
        java.lang.String str11 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        java.lang.String str13 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "module$module$module$module$module$module$module$" + "'", str6, "module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str8, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str11, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str13, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.ProcessCommonJSModules processCommonJSModules2 = new com.google.javascript.jscomp.ProcessCommonJSModules(abstractCompiler0, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        java.lang.String str4 = processCommonJSModules2.guessCJSModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            processCommonJSModules2.process(node5, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str4, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$hi!", "module$module$module$module$module$module$module$module$module$");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$hi!" + "'", str2, "module$module$module$module$hi!");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$", "module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String str2 = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName("module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!", "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!" + "'", str2, "module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$module$hi!");
    }
}

