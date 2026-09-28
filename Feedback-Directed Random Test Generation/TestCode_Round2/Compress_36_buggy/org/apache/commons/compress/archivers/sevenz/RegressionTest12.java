package org.apache.commons.compress.archivers.sevenz;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean27 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 1);
        boolean boolean27 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 10);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean26 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile27 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '#');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 10);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) 0);
        boolean boolean24 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile25 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 };
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 100);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (-1));
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray4, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        java.io.File file0 = null;
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile15 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 10);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) ' ');
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile24 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.io.File file0 = null;
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 32);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) (byte) 0);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, 0);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) 'a');
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '4');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray7, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.compress.archivers.sevenz.SevenZFile sevenZFile22 = new org.apache.commons.compress.archivers.sevenz.SevenZFile(file0, byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 100);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) ' ');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) '4');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (-1));
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        byte[] byteArray0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature;
        boolean boolean2 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) -1);
        boolean boolean6 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (byte) 0);
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 1);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 100);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 10);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) '4');
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) 1);
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) (short) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray0, (int) 'a');
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 55, (byte) 122, (byte) -68, (byte) -81, (byte) 39, (byte) 28 });
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '#');
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 100);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) 'a');
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) 0);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        boolean boolean25 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 10);
        boolean boolean27 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        boolean boolean8 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 32);
        boolean boolean10 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean12 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean14 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) 0);
        boolean boolean16 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) 'a');
        boolean boolean18 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, (int) (byte) -1);
        boolean boolean20 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 10);
        boolean boolean22 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray6, 100);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        boolean boolean7 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (-1));
        boolean boolean9 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) -1);
        boolean boolean11 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean13 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 10);
        boolean boolean15 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean17 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, 1);
        boolean boolean19 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) '4');
        boolean boolean21 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) (byte) 100);
        boolean boolean23 = org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byteArray5, (int) ' ');
        java.lang.Class<?> wildcardClass24 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }
}

