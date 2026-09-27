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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, false);
        java.lang.Class<?> wildcardClass37 = inlineVariables36.getClass();
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode7 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables9 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode7, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables11 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables13 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables15 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode7, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode7, false);
        org.junit.Assert.assertTrue("'" + mode7 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode7.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, false);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode15 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables17 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode15, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode15, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode15, false);
        java.lang.Class<?> wildcardClass46 = mode15.getClass();
        org.junit.Assert.assertTrue("'" + mode15 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode15.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = inlineVariables24.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode8 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables10 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode8, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode8, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode8, true);
        java.lang.Class<?> wildcardClass25 = mode8.getClass();
        org.junit.Assert.assertTrue("'" + mode8 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode8.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode10 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables12 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode10, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode10, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode10, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables30.process(node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode10 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode10.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode12 = com.google.javascript.jscomp.InlineVariables.Mode.ALL;
        com.google.javascript.jscomp.InlineVariables inlineVariables14 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables16 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables18 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables20 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables22 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables24 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables26 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables28 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables30 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode12, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables32 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables34 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode12, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables36 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode12, true);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables36.process(node37, node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode12 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.ALL + "'", mode12.equals(com.google.javascript.jscomp.InlineVariables.Mode.ALL));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        com.google.javascript.jscomp.InlineVariables.Mode mode17 = com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY;
        com.google.javascript.jscomp.InlineVariables inlineVariables19 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler16, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables21 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler15, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables23 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler14, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables25 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler13, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables27 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler12, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables29 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler11, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables31 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler10, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables33 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler9, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables35 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler8, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables37 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler7, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables39 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler6, mode17, true);
        com.google.javascript.jscomp.InlineVariables inlineVariables41 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler5, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables43 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler4, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables45 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler3, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables47 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler2, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables49 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler1, mode17, false);
        com.google.javascript.jscomp.InlineVariables inlineVariables51 = new com.google.javascript.jscomp.InlineVariables(abstractCompiler0, mode17, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = null;
        // The following exception was thrown during execution in test generation
        try {
            inlineVariables51.process(node52, node53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + mode17 + "' != '" + com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY + "'", mode17.equals(com.google.javascript.jscomp.InlineVariables.Mode.LOCALS_ONLY));
    }
}

