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
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        boolean boolean15 = renamer14.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str12 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        java.lang.String str4 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.String str7 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str10 = contextualRenamer0.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str9 = contextualRenamer0.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.enterScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        java.lang.Class<?> wildcardClass7 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str14 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("hi!");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        boolean boolean18 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = makeDeclaredNamesUnique7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = makeDeclaredNamesUnique7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str13 = inlineRenamer3.getReplacementName("");
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = makeDeclaredNamesUnique1.shouldTraverse(nodeTraversal2, node3, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        java.lang.String str11 = contextualRenamer0.getReplacementName("arguments");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str10 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str12 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str10 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str12 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean13 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str10 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        boolean boolean12 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        renamer8.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer22 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique23 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique23.visit(nodeTraversal24, node25, node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNotNull(renamer19);
        org.junit.Assert.assertNotNull(renamer22);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str15 = contextualRenamer0.getReplacementName("");
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer20 = contextualRenamer0.forChildScope();
        boolean boolean21 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer22 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(renamer22);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer21 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNotNull(renamer21);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str10 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.visit(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str19 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str21 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique22.exitScope(nodeTraversal23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass8 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str10 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("");
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass9 = renamer8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique4.enterScope(nodeTraversal5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer3);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = makeDeclaredNamesUnique13.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        boolean boolean9 = renamer8.stripConstIfReplaced();
        renamer8.addDeclaredName("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        boolean boolean1 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str6 = contextualRenamer0.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str13 = contextualRenamer0.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str8 = contextualRenamer0.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        java.lang.String str8 = contextualRenamer0.getReplacementName("$$");
        java.lang.Class<?> wildcardClass9 = contextualRenamer0.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        java.lang.String str16 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique1 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = makeDeclaredNamesUnique9.shouldTraverse(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        java.lang.Class<?> wildcardClass11 = renamer10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.enterScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str12 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean13 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass8 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = renamer7.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        renamer8.addDeclaredName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str16 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = inlineRenamer3.forChildScope();
        java.lang.String str19 = renamer17.getReplacementName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("");
        boolean boolean10 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        java.lang.String str18 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer20 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(renamer19);
        org.junit.Assert.assertNotNull(renamer20);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        java.lang.String str13 = inlineRenamer3.getReplacementName("$$");
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str10 = contextualRenamer0.getReplacementName("");
        java.lang.String str12 = contextualRenamer0.getReplacementName("$$");
        boolean boolean13 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str7 = contextualRenamer0.getReplacementName("$$");
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.enterScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        java.lang.String str10 = contextualRenamer0.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        boolean boolean9 = renamer8.stripConstIfReplaced();
        boolean boolean10 = renamer8.stripConstIfReplaced();
        java.lang.String str12 = renamer8.getReplacementName("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        java.lang.String str10 = contextualRenamer0.getReplacementName("");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean13 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = contextualRenamer0.forChildScope();
        boolean boolean15 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str9 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = renamer13.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        java.lang.String str17 = renamer13.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str12 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("arguments");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "$$", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        renamer6.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        java.lang.String str10 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.Class<?> wildcardClass12 = renamer11.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.exitScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique8.exitScope(nodeTraversal9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = makeDeclaredNamesUnique15.shouldTraverse(nodeTraversal16, node17, node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        inlineRenamer3.addDeclaredName("");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique7.exitScope(nodeTraversal8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.enterScope(nodeTraversal11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str13 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        boolean boolean19 = renamer18.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        java.lang.String str20 = renamer18.getReplacementName("arguments");
        renamer18.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        java.lang.String str8 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str11 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        boolean boolean3 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.Class<?> wildcardClass8 = makeDeclaredNamesUnique7.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        boolean boolean1 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("hi!");
        boolean boolean5 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique18 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(renamer19);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str10 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        boolean boolean12 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        java.lang.String str19 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        boolean boolean10 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        boolean boolean1 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean2 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique12.enterScope(nodeTraversal13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str11 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str13 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        boolean boolean13 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = renamer16.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNotNull(renamer17);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean10 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str15 = contextualRenamer0.getReplacementName("");
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = renamer8.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.visit(nodeTraversal10, node11, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean21 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean14 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str19 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer20 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass21 = inlineRenamer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(renamer20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        renamer10.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = renamer8.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = makeDeclaredNamesUnique10.shouldTraverse(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        renamer8.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = renamer8.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer11.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean10 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        contextualRenamer0.addDeclaredName("arguments");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique11.enterScope(nodeTraversal12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        boolean boolean11 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        renamer12.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.enterScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique16 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        java.lang.String str19 = boilerplateRenamer2.getReplacementName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        boolean boolean22 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        java.lang.String str10 = boilerplateRenamer2.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str15 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str17 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str19 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        java.lang.Class<?> wildcardClass11 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("$$");
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean5 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        boolean boolean8 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer9);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(renamer10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boolean boolean7 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        inlineRenamer3.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str8 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str12 = contextualRenamer0.getReplacementName("");
        boolean boolean13 = contextualRenamer0.stripConstIfReplaced();
        boolean boolean14 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = renamer13.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique15 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer13);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique15.exitScope(nodeTraversal16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        java.lang.String str15 = renamer13.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique14.exitScope(nodeTraversal15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("arguments");
        contextualRenamer0.addDeclaredName("");
        java.lang.String str17 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean14 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str16 = contextualRenamer0.getReplacementName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        java.lang.String str6 = renamer4.getReplacementName("arguments");
        renamer4.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique17 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique17.enterScope(nodeTraversal18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        boolean boolean8 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str10 = contextualRenamer0.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("$$");
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique13 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = makeDeclaredNamesUnique13.shouldTraverse(nodeTraversal14, node15, node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = inlineRenamer3.forChildScope();
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = inlineRenamer3.forChildScope();
        java.lang.String str18 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique19 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(renamer16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        boolean boolean18 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique9.enterScope(nodeTraversal10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "$$");
        java.lang.String str4 = boilerplateRenamer2.getReplacementName("$$");
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        java.lang.Class<?> wildcardClass8 = boilerplateRenamer2.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = renamer5.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boolean boolean15 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer16 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(renamer16);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = renamer8.stripConstIfReplaced();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        java.lang.String str7 = contextualRenamer0.getReplacementName("hi!");
        java.lang.String str9 = contextualRenamer0.getReplacementName("hi!");
        java.lang.String str11 = contextualRenamer0.getReplacementName("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        java.lang.String str16 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer20 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer21 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique22 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = makeDeclaredNamesUnique22.shouldTraverse(nodeTraversal23, node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(renamer20);
        org.junit.Assert.assertNotNull(renamer21);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("");
        boolean boolean12 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str7 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str9 = contextualRenamer0.getReplacementName("hi!");
        boolean boolean10 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        java.lang.String str7 = inlineRenamer3.getReplacementName("");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("$$");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str15 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = contextualRenamer0.forChildScope();
        java.lang.Class<?> wildcardClass19 = contextualRenamer0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str9 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        boolean boolean11 = renamer10.stripConstIfReplaced();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            renamer7.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str15 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(renamer18);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("hi!");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str14 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(renamer15);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass11 = inlineRenamer3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique8 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = makeDeclaredNamesUnique8.shouldTraverse(nodeTraversal9, node10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str15 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("hi!");
        java.lang.String str21 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer24 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique25 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer24);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(renamer24);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer5);
        java.lang.String str8 = renamer5.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = contextualRenamer0.forChildScope();
        java.lang.String str9 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        java.lang.String str12 = boilerplateRenamer2.getReplacementName("hi!");
        java.lang.String str14 = boilerplateRenamer2.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer17 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(renamer17);
        org.junit.Assert.assertNotNull(renamer18);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = renamer15.getReplacementName("$$");
        renamer15.addDeclaredName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("");
        boilerplateRenamer2.addDeclaredName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        boolean boolean10 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        boolean boolean6 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str8 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str10 = contextualRenamer0.getReplacementName("hi!");
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("hi!");
        boolean boolean14 = contextualRenamer0.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass15 = contextualRenamer0.getClass();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("hi!");
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer2 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = contextualRenamer0.forChildScope();
        java.lang.String str5 = contextualRenamer0.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer2);
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        java.lang.String str12 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str14 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str16 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str18 = inlineRenamer3.getReplacementName("arguments");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        boolean boolean10 = renamer9.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        boilerplateRenamer2.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        inlineRenamer3.addDeclaredName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        java.lang.String str9 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer11);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str8 = inlineRenamer3.getReplacementName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer19 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNotNull(renamer19);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str16 = inlineRenamer3.getReplacementName("");
        boolean boolean17 = inlineRenamer3.stripConstIfReplaced();
        java.lang.Class<?> wildcardClass18 = inlineRenamer3.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique14 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        java.lang.String str16 = contextualRenamer0.getReplacementName("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        boolean boolean9 = contextualRenamer0.stripConstIfReplaced();
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = contextualRenamer0.forChildScope();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique12 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = makeDeclaredNamesUnique12.shouldTraverse(nodeTraversal13, node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        boolean boolean4 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        boolean boolean6 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("hi!");
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        renamer12.addDeclaredName("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique11 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        boilerplateRenamer2.addDeclaredName("arguments");
        boolean boolean17 = boilerplateRenamer2.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer18 = boilerplateRenamer2.forChildScope();
        java.lang.String str20 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(renamer18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("arguments");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique10.visit(nodeTraversal11, node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique(renamer5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        // The following exception was thrown during execution in test generation
        try {
            makeDeclaredNamesUnique6.exitScope(nodeTraversal7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str10 = inlineRenamer3.getReplacementName("arguments");
        boolean boolean11 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean12 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = inlineRenamer3.forChildScope();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean15 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(renamer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        java.lang.String str6 = inlineRenamer3.getReplacementName("arguments");
        java.lang.String str8 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        inlineRenamer3.addDeclaredName("");
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        boolean boolean13 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean14 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer14 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer15 = boilerplateRenamer2.forChildScope();
        java.lang.String str17 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer14);
        org.junit.Assert.assertNotNull(renamer15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        java.lang.String str5 = inlineRenamer3.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        java.lang.String str8 = inlineRenamer3.getReplacementName("$$");
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("$$");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = contextualRenamer0.forChildScope();
        java.lang.String str10 = contextualRenamer0.getReplacementName("");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        boolean boolean6 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("arguments");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique7 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = makeDeclaredNamesUnique7.shouldTraverse(nodeTraversal8, node9, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        boolean boolean9 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        boolean boolean3 = boilerplateRenamer2.stripConstIfReplaced();
        java.lang.String str5 = boilerplateRenamer2.getReplacementName("$$");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = boilerplateRenamer2.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(renamer6);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str7 = inlineRenamer3.getReplacementName("$$");
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique4 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = inlineRenamer3.forChildScope();
        java.lang.String str11 = inlineRenamer3.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        java.lang.Class<?> wildcardClass13 = inlineRenamer3.getClass();
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) inlineRenamer3);
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str9 = inlineRenamer3.getReplacementName("");
        boolean boolean10 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str12 = inlineRenamer3.getReplacementName("hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "hi!", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        java.lang.String str6 = inlineRenamer3.getReplacementName("");
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        java.lang.String str10 = inlineRenamer3.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = inlineRenamer3.forChildScope();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", false);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = inlineRenamer3.forChildScope();
        inlineRenamer3.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = inlineRenamer3.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = inlineRenamer3.forChildScope();
        boolean boolean9 = inlineRenamer3.stripConstIfReplaced();
        // The following exception was thrown during execution in test generation
        try {
            inlineRenamer3.addDeclaredName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique9 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        boolean boolean7 = contextualRenamer0.stripConstIfReplaced();
        java.lang.String str9 = contextualRenamer0.getReplacementName("");
        java.lang.String str11 = contextualRenamer0.getReplacementName("arguments");
        java.lang.String str13 = contextualRenamer0.getReplacementName("arguments");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str4 = contextualRenamer0.getReplacementName("$$");
        java.lang.String str6 = contextualRenamer0.getReplacementName("hi!");
        contextualRenamer0.addDeclaredName("arguments");
        contextualRenamer0.addDeclaredName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        java.lang.String str13 = contextualRenamer0.getReplacementName("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        java.lang.String str7 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str9 = boilerplateRenamer2.getReplacementName("");
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer13 = renamer12.forChildScope();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(renamer12);
        org.junit.Assert.assertNotNull(renamer13);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        contextualRenamer0.addDeclaredName("arguments");
        java.lang.String str10 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer11 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer12 = renamer11.forChildScope();
        renamer12.addDeclaredName("$$");
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(renamer11);
        org.junit.Assert.assertNotNull(renamer12);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer1 = contextualRenamer0.forChildScope();
        contextualRenamer0.addDeclaredName("");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique5 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str9 = contextualRenamer0.getReplacementName("hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer10 = contextualRenamer0.forChildScope();
        boolean boolean11 = contextualRenamer0.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer1);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(renamer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "hi!");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        java.lang.String str6 = boilerplateRenamer2.getReplacementName("arguments");
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer contextualRenamer0 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer();
        java.lang.String str2 = contextualRenamer0.getReplacementName("$$");
        contextualRenamer0.addDeclaredName("$$");
        contextualRenamer0.addDeclaredName("$$");
        java.lang.String str8 = contextualRenamer0.getReplacementName("arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = contextualRenamer0.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique10 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) contextualRenamer0);
        contextualRenamer0.addDeclaredName("");
        java.lang.String str14 = contextualRenamer0.getReplacementName("$$");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer boilerplateRenamer2 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.BoilerplateRenamer(strSupplier0, "arguments");
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer3 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer4 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer5 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique makeDeclaredNamesUnique6 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique((com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer) boilerplateRenamer2);
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer7 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer8 = boilerplateRenamer2.forChildScope();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer9 = boilerplateRenamer2.forChildScope();
        java.lang.String str11 = boilerplateRenamer2.getReplacementName("arguments");
        boilerplateRenamer2.addDeclaredName("hi!");
        java.lang.String str15 = boilerplateRenamer2.getReplacementName("arguments");
        boolean boolean16 = boilerplateRenamer2.stripConstIfReplaced();
        org.junit.Assert.assertNotNull(renamer3);
        org.junit.Assert.assertNotNull(renamer4);
        org.junit.Assert.assertNotNull(renamer5);
        org.junit.Assert.assertNotNull(renamer7);
        org.junit.Assert.assertNotNull(renamer8);
        org.junit.Assert.assertNotNull(renamer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.google.common.base.Supplier<java.lang.String> strSupplier0 = null;
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer inlineRenamer3 = new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(strSupplier0, "arguments", true);
        boolean boolean4 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean5 = inlineRenamer3.stripConstIfReplaced();
        com.google.javascript.jscomp.MakeDeclaredNamesUnique.Renamer renamer6 = inlineRenamer3.forChildScope();
        boolean boolean7 = inlineRenamer3.stripConstIfReplaced();
        boolean boolean8 = inlineRenamer3.stripConstIfReplaced();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(renamer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}

