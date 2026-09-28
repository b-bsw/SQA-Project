package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        java.io.PrintStream printStream3 = null;
        java.io.PrintStream printStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner5 = new com.google.javascript.jscomp.CommandLineRunner(strArray2, printStream3, printStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "hi!" });
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!", "", "" };
        java.io.PrintStream printStream5 = null;
        java.io.PrintStream printStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner7 = new com.google.javascript.jscomp.CommandLineRunner(strArray4, printStream5, printStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!", "", "" });
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "hi!" };
        java.io.PrintStream printStream4 = null;
        java.io.PrintStream printStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CommandLineRunner commandLineRunner6 = new com.google.javascript.jscomp.CommandLineRunner(strArray3, printStream4, printStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!", "hi!" });
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        com.google.javascript.jscomp.CommandLineRunner commandLineRunner3 = new com.google.javascript.jscomp.CommandLineRunner(strArray2);
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = commandLineRunner3.createOptions();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(compilerOptions4);
    }
}

